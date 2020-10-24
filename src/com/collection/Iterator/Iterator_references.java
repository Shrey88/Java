package com.collection.Iterator;


/*
 *  Important Point
 *      Please note that initially any iterator reference will point to the index just before
 *  the index of first element in a collection.
 *
 *  we don't create objects of enumeration, iterator, listIterator because they are interfaces.
 *  we use methods like elements(), iterator(), listiterator() to create objects.
 *  These methods have anonymous inner classes that extends respective interfaces and return
 *  this class object.
 *
 *  The $ symbol in reference class name is a proof that concept of inner classes is used and these class objects are created.
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iterator_references {
    public static void main(String[] args) {
        Vector v = new Vector();

        // creating three iterators
        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator ltr = v.listIterator();

        //print class names of iterators
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
