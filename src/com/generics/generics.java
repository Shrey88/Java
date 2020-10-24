package com.generics;

/*
 *  generics allow us to create classes, interfaces, method that takes
 *  types of parameters called unsurprisingly type parameters
 *
 *  so when we actually provide a type parameter to a generic type this is called a
 *  parameterized type.
 */


import java.util.ArrayList;

/*
 *  when writing new code you should almost never use these raw types any more
 *  the reason being, we can insert any kind of object into the array list
 *  and it might crash at runtime.
 */
public class generics {
    public static void main(String[] args) {
        // array list created here is of generic type or raw type.
        //  ArrayList items = new ArrayList();

        // parameterized type
        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);   // autoboxing of Integer is happening implicitly
        items.add(2);   // autoboxing of Integer is happening implicitly
        items.add(3);   // autoboxing of Integer is happening implicitly

        // since we have not specified the type for the arraylist it is accepting
        // the string as input but will throw error on runtime when it tries to do unboxing
        // but if you have declared the ArrayList with the parameterized type then it will
        // throw the error at compile time.
        //items.add("Shreyas");

        items.add(4);   // autoboxing of Integer is happening implicitly
        items.add(5);   // autoboxing of Integer is happening implicitly

        printDoubled(items);
    }


    //  if you are using the generic type
//    private static void printDoubled(ArrayList n){
//        for(Object i : n){
//            System.out.println((Integer)i*2);
//        }
//    }

    //  if you are using the parameterized type
    private static void printDoubled(ArrayList<Integer> n){
        for(int i : n){
            System.out.println((Integer)i*2);
        }
    }
}
