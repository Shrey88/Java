package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *  Linked list is part of the collection framework present in java.util.package. This class is implementation
 * of the LinkedList  data structure which is a linear data structure where the elements are not stored in
 * contiguous locations and every element is a separate object with a data part and address part.
 * The elements are linked using pointers and addresses.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placestoVisit = new LinkedList<String>();
        placestoVisit.add("Sydney");
        placestoVisit.add("Melbourne");
        placestoVisit.add("Brisbane");
        placestoVisit.add("Perth");
        placestoVisit.add("Canberra");
        placestoVisit.add("Adelaide");
        placestoVisit.add("Darwin");

        printList(placestoVisit);

        placestoVisit.add(1, "Alice Springs");
        printList(placestoVisit);

        placestoVisit.remove(4);
        printList(placestoVisit);
    }
    private static void printList(LinkedList<String> LinkedList){
        Iterator<String> i = LinkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting :" + i.next());
        }
        System.out.println("===========================");
    }


}
