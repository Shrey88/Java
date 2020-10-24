package com.collection.arrays;

import java.util.Scanner;

public class Array_2 {

    private  static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        // returning array from the method/function
        int[] myIntArray = getIntegers(5);
        for(int i = 0; i < myIntArray.length; i++){
            System.out.println("Value at index #" + i + " : " + myIntArray[i]);
        }
    }

    public static int[] getIntegers(int size){
        int[] myIntArray = new int[size];

        for(int i = 0; i < myIntArray.length; i++){
            System.out.print("#"+i + " : ");
            myIntArray[i] = scanner.nextInt();
            System.out.println("");
        }

        return myIntArray;
    }
}
