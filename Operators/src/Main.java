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

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien");

        int topScore = 100;
        int myScore  = 99;
        if (myScore >= topScore) {
            System.out.println("You have the top score");
        } else {
            System.out.println("You do not have the high score");
        }

        double twenty = 20.00d;
        double eighty = 80.00d;
        double challengeResult = 100d * (twenty + eighty);
        double remainder = challengeResult % 40.00d;
        boolean hasRemainder = remainder == 0 ? false : true;
        System.out.println(hasRemainder);
        if(!hasRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
