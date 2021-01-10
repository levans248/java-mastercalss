public class JavaMethodCodingExercises {

    public static void main(String[] args) {
        printConversion(-1);
        printConversion(6);
        printConversion(0);

        printMegaBytesAndKiloBytes(2500);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int MB = kiloBytes / 1024;
            int KB = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23 ) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        int divisibleBy4 = year % 4;
        int divisibleBy100 = year % 100;
        int divisbileBy400 = year % 400;

        if (divisibleBy4 == 0 && divisibleBy100 != 0) {
            return true;
        } else if(divisibleBy4 == 0 && divisbileBy400 == 0) {
            return true;
        }

        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo) {
        return (int) (valueOne*1000) == (int) (valueTwo*1000);
    }

    public static boolean hasEqualSum(int valueOne, int valueTwo, int sum) {
        return valueOne + valueTwo == sum;
    }

    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree) {
        if( isTeen(valueOne) || isTeen(valueTwo) || isTeen(valueThree)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }
}
