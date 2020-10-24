package com.oops.abstract_class;

/*
 *  abstract class is not like interface where all the methods needs to be abstract
 *  it can contain some methods with the body and need not be overrided in the subclass.
 */

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract  void breathe();

    public String getName(){
        return this.name;
    }
}
