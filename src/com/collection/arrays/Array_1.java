package com.collection.arrays;

public class Array_1 {
    public static void main(String[] args) {
        /*
         *  This is one way of initializing the array
         */
        int[] myIntArray = new int[5];

        // passing the array to a method/function
        assignArray(myIntArray);
        printArray(myIntArray);
        /*
         *  This is another way of initializing the array.
         */
        int[] myIntArray_1 = new int[]{1, 2, 3, 4, 5};
        int[] myIntArray_2 = {1, 2, 3, 4, 5};
    }

    public static void assignArray(int[] array){
        // we can use for loop to initialize the array
        for(int i = 0; i < array.length; i++){
            array[i] = i * 10;
        }
    }

    public static void printArray(int[] array){
        /*
         *  this is how you can retrieve the values
         */
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index "+i +": " + array[i]);
        }
    }
}
