package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * It is only applicable for List Collection implemented classes like arratlist, linkedlist etc.
 * it provides bi-directional iteration.
 *
 * ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality than
 * iterator
 *
 * ListIterator object can be created by calling listIterator() method present in List interface.
 *
 * ListIterator interface extends iterator interface. So all three methods of iterator interface are available for
 * ListIterator in addition to existing three method, there are six more methods.
 *      public boolean hasNext();   returns true if the iteration has more elements
 *
 *      public Object next();   same as next() method of Iterator
 *
 *      public int nextIndex(); returns the next element index or list size if the list iterator is at end of list
 *
 *      public boolean hasPrevious();   returns true if the iteration has more elements while traversing backward
 *
 *      public Object previous();   returns the previous element in the iteration and throw NoSuchElementException if no more element present
 *
 *      public in previousIndex();  returns the previous element index or -1 if the list iterator is at the beginning of the list
 *
 *      public void remove();
 *
 *      public void set(Object obj);    replaces the last element returned by next() or previous() with the specified element
 *
 *      public void add(Object obj);    insert the specified element into the list at position before the
 *                                      element would be returned by next();
 *
 *  List Iterator has not current element; its cursor position always lies between the element that would be returned by
 *  call to previous() and the element that would be returned by a call to next()
 *
 *  set() method can throw four exceptions
 *      UnsupportedOperationException - if the set operation is not supported by this list iterator
 *      ClassCastException - if the class of the specified element prevents it from being added to the list
 *      illegalArgumentException - if some aspect of the specified element prevents it from being added to this list
 *      illegalStateException - if neither next nor previous have been called, or remove or add have balled after the
 *                              call to next or previous
 *
 * add() method can throw three exceptions
 *  UnsupportedOperationException : if the add method is not supported by this list iterator
 *  ClassCastException : if the class of the specified element prevents it from being added to this list.
 * illegalArgumentException : if some aspect of this element prevents it from being added to this list.
 *
 */
public class ListIterators {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning itr cursor will point to
        // index just before the first element in al
        ListIterator itr = al.listIterator();

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
