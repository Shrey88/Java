package com.collection.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 *  ArrayList is a part of collection framework and is present in java.util.package
 *  if provides us with dynamic array in Java.
 *  Though, it may be slower than standard array but can be helpful in programs
 *  where lots of manipulation in the array is needed.
 *  This class is found in java.util package.
 *
 *  ArrayList(class) --> (Implements)List --> (extends) Collection
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i < groceryList.size(); i++){
            System.out.println((i+1) + ", " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){

        groceryList.set(position, newItem);
        /*
         *  the reason for doing position+1 is because we showing the item numbers
         *  starting from 1 but actually in the list the numbers start from 0
         */
        System.out.println("Grocery Item " + (position+1) + " has been modified");
    }

    // removing the item from the position automatically moves up the item below it
    // one position up.
    public void removeGroceryItem(int position){
        /*
         *  the reason for doing position-1 is because we showing the item numbers
         *  starting from 1 but actually in the list the numbers start from 0
         */
        String theItem = groceryList.get(position-1);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        /*
         *  This is the one way of finding the object exists in the list or not
         */
        boolean exists = groceryList.contains(searchItem);

        /*
         *  another way is to use the indexof
         */
        int position = groceryList.indexOf(searchItem);
        if(position >= 0)
                return groceryList.get(position);

        return null;
    }
}