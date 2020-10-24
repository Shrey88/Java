package com.packages.challenge;

/*
 *  will create a jar of this class and test it out by importing it in new project as external library
 *
 *  before creating the jar file make sure the class with the main method should not be present in the folder.
 *
 */
public class Series {

    public static long nSum(int n){
        int sum = 0;
        sum += n;
        return sum;
    }

    public static long factorial(int n){
        int fact = 0;
        if(n > 0) {
            return n * (factorial(n-1));
        }
        return 1;
    }

    public static long fibonacci(int n ){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for(int i = 1; i < n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }

        return fib;
    }
}
