package com.collection.Iterator;

import java.util.Enumeration;
import java.util.Vector;

/*
 *  Iterators are used in Collection framework in Java to retrieve elements one by one.
 *  There are 3 iterators
 *
 *  It is a interface used to get elements of legacy collections (Vector, Hashtable).
 *  Enumerations are used to specify the input streams to a SequencelInputStream
 *
 *  We can create Enumeration object by calling elements() method of vector class  on any vector object
 *
 *  There are two methods in Enumeration interface namely:
 *      Test if this enumeration contains more elements
 *          public boolean hasMoreElements();
 *
 *      Returns the next element of this enumeration
 *      it throws NoSuchElementException
 *      if no more element present
 *          public Object nextElements();
 *
 *  Limitation of Enumeration
 *      Enumeration is for legacy classes (Vector, Hashtable) only. It is not universal iterator.
 *      Remove operations can't be performed using Enumeration
 *      Only forward direction iterating is possible.
 *
 */
public class Enumerator {
    public static void main(String[] args) {
        Vector<Integer>v = new Vector<>();

        for(int i = 0; i < 10; i++){
            v.addElement(i);
        }

        System.out.println(v);

        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements();

        //Checking the next element availability
        while(e.hasMoreElements()){

            int i = (Integer)e.nextElement();   // doing the typecast

            System.out.print(i + " ");
        }
    }
}
