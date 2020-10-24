package com.oops.interfaces;

import java.util.List;

/*
 *  List is the interface class
 *  You can declare the return tye of the function as List making it flexible for the user
 *  to return the objects of class that implements List.
 *
 *  You can further go ahead and even remove the type making giving the user some more
 *  flexibility to return the list of any type they want.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
