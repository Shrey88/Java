package com.packages;


/*
 *  Class or interface name conflicts are inevitable
 *
 *  Mechanism is needed to fully specify class
 *
 *  Allow use of classes with the same name in the same project (or , even the same class)
 *
 *  think the package is a way of grouping related classes and inteerfaces together.
 *
 *  So actual package mechanism provides a way to manage the name space of object types
 *  and it also extends access protection beyond the traditional access, modifiers you
 *  see before and public, protected, private etc.
 *
 *  programmers can easily determine that the classes are related.
 *
 *  it is eary to know where to find the classes and interfaces that can provide the
 *  functions provided by the package
 *
 *  because the package created a new namespace, class and interface name conflicts are avoided.
 *
 *  Classes within the package can have unrestricted access to one another while still restricting access
 *  for classes outside the package.
 *
 *  java.lang for e.g. contains the class object that is used to support our classes as well as integer and
 *  double etc and all the fundamental building blocks of a Java program.
 *  So that happens automatically when you create even the most basic Java programs
 *  Now you will actually not see an import for java.lang because it's automatically imported for us.
 */

public class Package{
    public static void main(String[] args) {

        /*
         *  In case if you have Node class from different set of packages
         *  then it will show you the list of packages from where you wan to
         *  import the Node class
         *
         *  to see the list of packages select you can select the class name
         *  and press alt + enter
         */
        //Node node = null;

        /*
         *  another way of using a class from two different packages is by using
         *  package name with the class name as it will not allow you to import
         *  two different packages containing the same class
         */
        org.w3c.dom.Node node1 = null;
    }
}