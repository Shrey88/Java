package com.java_basics;

/*
 *  Parse the value from a string
 */
public class parseValue {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("Number as String = " + numberAsString);

        /*
         * Integer is a wrapper class for type int
         */
        int number  = Integer.parseInt(numberAsString);
        System.out.println("Parsed to Int = " + number);

        /*
         * Similarly you also have wrapper class for Double
         */
        double dNumber = Double.parseDouble("220.444");
        System.out.println("Parsed to double = " + dNumber);

        /*
         * Similarly you also have wrapper class for Long, Short, Float
         */
        long lNumber = Long.parseLong("234242341");
        System.out.println("Parsed to long = " + lNumber);

        /*
         * Similarly you also have wrapper class for Short, Float
         */
        short sNumber = Short.parseShort("32767");
        System.out.println("Parsed to short = " + sNumber);

        /*
         * Similarly you also have wrapper class for Float
         */
        float fNumber = Float.parseFloat("2323.2323423");
        System.out.println("Parsed to float = " + fNumber);
    }
}
