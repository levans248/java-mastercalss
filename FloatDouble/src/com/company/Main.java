package com.company;

public class Main {

    public static void main(String[] args) {
	    // float - single precision 32 bits
        // double - double precision 64 bits

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("f min: " + minFloat+ " f out: " + maxFloat );

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("d min: " + minDouble+ " d out: " + maxDouble );

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3; // d is optional since double is default by java, but good practice to always use d
        // double faster by most computers 64 bits
        // java math functions expect double
        // only use float if you have a specific reason

        System.out.println("int: " + myIntValue + " f: " + myFloatValue + " d: " + myDoubleValue );

        // lbs to kilos
        int lbs = 170;
        double kiloConversion = 0.45359237;
        double kilos = lbs * kiloConversion;
        System.out.println(kilos);

    }
}
