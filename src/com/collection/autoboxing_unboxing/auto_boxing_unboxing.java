package com.collection.autoboxing_unboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class auto_boxing_unboxing {

    public static void main(String[] args) {

        /*
         *  we cannot use the primitive type because they are not classes
         *  and we actually need a class reference that we can actually use
         *  that to be able to save something to an arrayList
         */
        //ArrayList<int> inArrayList = new ArrayList<int>();

        /*
         *  other way of doing it is by creating a class that stores an int value
         *
         *  so actually created a wrapper and we said that the integer myValue is the
         *  variable that's gonna contain the value for this class and we wrapped up in a class.
         *
         *  we also made sure that it was not available publicly.
         *
         *  we can initialize it with constructor initially and then a setter
         */
        ArrayList<IntClass> IntClassArrayList = new ArrayList<>();
        IntClassArrayList.add(new IntClass(50));


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            /*
             *  This is auto boxing
             *  this is when we are creating or converting an integer,
             *  a base primitive type into an integer
             *  So we are taking the primitive type and we are going to
             *  the object wrapper. we're going to the class, that's called autoboxing
             */
            intArrayList.add(Integer.valueOf(i));
        }


        for(int i = 0; i <=10; i++){
            /*
             *  Unboxing is where we are taking it from the class or from the
             *  object wrapper and converting it back to primitive type.
             */
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        /*
         *  you can also do this way
         *
         *  so at compile time it gets converted to Integer.valueof(56)
         *
         *  Java does the hard work for us, because it recognizes and it says
         *  okay this is an integer assigned to integer object, so therefore it knows
         *  what to do with it.
         */
        Integer myValue = 56;

        int myInt = myValue; // it internally does this myValue.intValue();


        /*
         *  Example of Double
         *
         *  we will convert the primitive type double to the object wrapper, to the
         *  object in other words, that's autoboxing
         *
         *  and we will use doubleValue() to actually unbox i.e to convert it from object
         *  back to the primitive type of this case double which is value
         */
        System.out.println("");
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for(double d = 0.0; d <= 10.0; d+=0.5){
            doubleArrayList.add(Double.valueOf(d));
        }


        for(int i = 0 ; i < doubleArrayList.size(); i++){
            double myDValue = doubleArrayList.get(i).doubleValue();
            System.out.println(i + " --> " + myDValue);
        }

    }
}
