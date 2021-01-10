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

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long daysLeftInYears = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + daysLeftInYears + " d");
        }
    }

    public static void printEqual(int valueOne, int valueTwo, int valueThree) {
        if (valueOne < 0 || valueTwo < 0 || valueThree < 0) {
            System.out.println("Invalid Value");
        } else if( valueOne == valueTwo && valueOne == valueThree) {
            System.out.println("All numbers are equal");
        } else if(valueTwo != valueThree && valueOne != valueThree && valueOne != valueTwo) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            if(temperature <= 35) {
                return true;
            } else if (temperature <= 45 && summer) {
                return true;
            }
        }

        return false;
    }
}
