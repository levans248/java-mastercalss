

public class ControlFlowCodingExercises {

    public static void main(String args[]) {
        numberToWords(100);
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
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

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        int days = 30;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        return days;
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        }

        if(!isOdd(start)) {
            start += 1;
        }

        int sum = 0;
        for(int i = start; i <= end; i+=2) {
            sum += i;
        }

        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = reverse(number);

        return reverse == number;
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean isNegative = number < 0;

        if (number < 10 && !isNegative) {
            reverse = number;
        } else {
            if (isNegative) {
                number *= -1;
            }
            while(number > 0) {
                int digit = number % 10;

                if(reverse != 0) {
                    reverse *= 10;
                }
                reverse += digit;

                number /= 10;
            }
            if (isNegative) {
                reverse *= -1;
            }

        }

        return reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int last  = 0;
        int first = 0;
        int iteration = 0;
        int digit;

        while (number > 0) {
            if (number == 10) {
                digit = 0;
            } else {
                digit = number % 10;
            }

            if (iteration == 0) {
                last = digit;
            }
            first = digit;

            number /= 10;
            iteration++;
        }

        return first + last;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int digit;
        while(number > 0) {
            if (number == 10) {
                digit = 0;
            } else {
                digit = number % 10;
            }

            if(digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;

        }

        return sum;
    }

    public static boolean hasSharedDigit(int valueOne, int valueTwo) {
        if(valueOne < 10 || valueOne > 99 || valueOne < 10 || valueTwo > 99) {
            return false;
        }

        int valueOneDigitOne = 0;
        if(valueOne / 10 != (valueOne / 10) * valueOne * 10 ) {
            valueOneDigitOne = valueOne % 10;
        }

        int valueOneDigitTwo = (valueOne / 10) % 10;

        int valueTwoDigitOne = 0;
        if(valueTwo / 10 != (valueTwo / 10) * valueTwo * 10 ) {
            valueTwoDigitOne = valueTwo % 10;
        }

        int valueTwoDigitTwo = (valueTwo / 10) % 10;

        if(valueOneDigitOne == valueTwoDigitOne || valueOneDigitOne == valueTwoDigitTwo) {
            return true;
        } else if (valueTwoDigitTwo == valueOneDigitTwo) {
            return true;
        }

        return false;

    }

    public static boolean hasSameLastDigit(int valueOne, int valueTwo, int valueThree) {
        if(!isValid(valueOne) || !isValid(valueTwo) || !isValid(valueThree)) {
            return false;
        }

        int lastValueOne = valueOne % 10;
        int lastValueTwo = valueTwo % 10;
        int lastValueThree = valueThree % 10;

        int same = 0;

        same = lastValueOne == lastValueTwo ? same += 1 : same;
        same = lastValueOne == lastValueThree ? same += 1 : same;
        same = lastValueTwo == lastValueThree ? same += 1 : same;

        return same >= 1;

    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int higher = first;
        if (first < second) {
            higher = second;
        }
        int gcd = 1;
        for(int i = 2; i <= higher/2; i++) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= number/2; i++) {
                if(number % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println(number);
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            for(int i = 1; i <= number/2; i++) {
                if(number % i == 0) {
                    sum += i;
                }
            }

            return sum == number;
        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversed   = reverse(number);
            int iterations = getDigitCount(number);

            for(int i = 0; i < iterations; i++) {
                int digit = reversed % 10;
                printNumberInWord(digit);
                reversed /= 10;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;
        while(number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
