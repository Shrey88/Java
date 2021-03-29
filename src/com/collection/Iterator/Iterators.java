package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  It is a universal iterator as we can apply it to any Collection object.
 *  We can perform both read and remove operations
 *
 *  It is improvised version of Enumeration with additional functionality of remove-ability of a element.
 *
 *  Iterator must be used when we want to enumerate elements in all Collection framework implemented interfaces like
 *  Set, List, Queue, Deque and also implemented classes of Map interface.
 *
 *  Iterator is the only cursor available for entire collection framework.
 *
 *  Iterator object can be created y calling iterator() method present in Collection interface.
 *
 *  Iterator interface defines three methods:
 *      public boolean hasNext(); returns true if the iteration has more elements
 *
 *      public Object next();   it throws NoSuchElementException if no more element present
 *
 *      public void remove();   this method can be called only once per call.
 *          remove method can throw two more exceptions
 *              UnsupportedOperationException: if the remove operations is not supported by this iterator
 *
 *              illegalStateException: if the next method has not yet been called, or the remove method has already
 *              been called after the last call to the next method.
 *
 *  replacement and addition of new element is not supported by iterator.
 */
public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning its cursor will point to
        // index just before the first element in al
        Iterator itr = al.iterator();

        //checking the next element availability
        while(itr.hasNext()){
            int i = (Integer)itr.next();

            System.out.println(i + " ");

            if(i % 2 != 0)
                itr.remove();
        }
        System.out.println();
        System.out.println(al);
    }
}
