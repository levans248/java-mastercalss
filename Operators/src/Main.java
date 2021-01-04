public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result; // primitives are not assigned as references
        System.out.println("Previous result: " + previousResult);

        result -=1;

        System.out.println("result: " + result);

        result *= 10;

        System.out.println(result);

        result /= 5;

        System.out.println(result);

        result %= 3;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);


    }
}
