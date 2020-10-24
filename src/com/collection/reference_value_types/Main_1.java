package com.collection.reference_value_types;

import java.util.Arrays;

public class Main_1 {

    public static void main(String[] args) {

        /*
         *  Value Types
         */
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My Int Value : " + myIntValue);
        System.out.println("Another Int Value : " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My Int Value : " + myIntValue);
        System.out.println("Another Int Value : " + anotherIntValue);


        /*
         *  Reference Types
         *  myIntArray is referencing the address of new array created on heap
         *  anotherArray is also referencing the same address that myIntArray is referencing
         *  to.
         *
         *  so if you change value in the array it will be reflected in both the arrays.
         */
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;    // anotherArray is referencing the address of myIntArray

        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

        System.out.println("myIntArray : " + Arrays.toString(myIntArray));
        System.out.println("anotherArray : " + Arrays.toString(anotherArray));

        modifyArray(anotherArray);
        // myIntArray and anotherArray are still pointing to the original memory
        // address of the array
        System.out.println("myIntArray : " + Arrays.toString(myIntArray));
        System.out.println("anotherArray : " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array){
        array[0] = 10;

        /*
         *  array has been created in new area of memory that array points to
         *  this will not change the actual array that we have passed to this
         *  function or method.
         */
        array = new int[]{60, 70, 80, 90, 100};
    }
}
