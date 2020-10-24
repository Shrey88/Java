package com.oops.interfaces;


/*
 *  like class , an interface can have methods and variables, but the methods declared in an interface are by default
 *  abstract(only method signature, no body).
 *
 *  Interfaces specify what a class must do and not how. It is the blueprint of the class
 *
 *  An interface is about capabilities like Player may be an interface and any class implementing Player must be able to
 *  (or must implement) move().So it specifies a set of methods that the class has to implement.
 *
 *  if a class implements an interface and does not provide method bodies for all the functions specified in the
 *  interface, then the class must be declared abstract.
 *
 *  A Java library example is Comparator interface. if a class implements this interface, then it can be used to sort a
 *  collection
 *
 *  To declare interface, use interface keyword. It is used to provide total abstraction. That means all the methods
 *  in an interface are declared with an empty body and are public and all fields are public, static and final by default
 *
 *  A class that implements an interface must implement all the methods declared in the interface.
 *  To implement interface use implements keyword.
 *
 *  Why do we use interface?
 *      it is used to achieve total abstraction.
 *
 *      since java does not support multiple inheritance in case of class, but by using interface it can
 *      achieve multiple inheritance.
 *
 *      it is also used to achieve loose coupling.
 *
 *      interfaces are used to implement abstraction.
 */

public interface ITelephone {
    /*
     * by default all the methods will be public so if do not specify the access modifier it is still fine.
     */
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
