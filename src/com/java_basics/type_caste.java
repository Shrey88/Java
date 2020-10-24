package com.java_basics;

public class type_caste {
    public static void main(String[] args){

        /*
         *  here it did not give any error as the value from the wrapper class
         *  is of type int and the result stored is also of type int
         */
        int myInt = (Integer.MIN_VALUE / 2);


        /*
         *  if you are providing the decimal value like this 3.45 then it treats
         *  this value as double (the reason is that double is assumed to be the default floating point
         *  number) so to tell the compiler that the value which is provided is
         *  float either append the value with "f" to tell that it is float value or do the
         *  casting of the value
         *
         */
        float myFloat_1 = (3.45f / 2);

        float myFloat_2 = (float)(34.252 / 2);
    }
}
