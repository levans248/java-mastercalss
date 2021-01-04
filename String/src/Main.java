public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";

        System.out.println(myString);

        myString += " this is more"; // use + for concatenation

        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt; // concatenates to string by autoboxing int and calling toString

        System.out.println(lastString);

        // Strings are immutable in java. Instead new string is created everytime and old string will be garbage collected
        // string concatenation is inefficient and you should use string buffer for this
    }
}
