package com.oops.method_overriding;

/*
 *  method overriding means defining a method in a child class that already exists in the
 *  parent class with the same signature(same name , same arguments)
 *
 *  Method overriding is also known as Runtime Polymorphism and Dynamic Method Disptach
 *  because the method that is going to be called is decided at runtime by the JVM
 *
 *  we can't override the static methods only instance methods can be overridden
 *
 * Rules:
 *  it must have same name and same arguments
 *  it must hav same return type or covariant return type(child class)
 *      covariant return type refers to return type of an overriding method
 *      covariant return type works only for non-primitive return types
 *      we can override a method by changing its return type only be abiding the condition that
 *      return type is a subclass of that of overridden method return type.
 *
 *  it can't have a lower access modifier but can have higher modifier
 *      for e.g. if the parent method is protected then using private in the child is not allowed
 *      but using public in the child would be allowed
 *
 * Important Points:
 *  only inherited methods can be overridden, in other words methods can be overridden only in child classes.
 *  constructors and private methods cannot be overridden.
 *  methods that are final cannot be overridden.
 *  A subclass can use super.methodName() to call the superclass version of an overridden method.
 */
public class method_overriding {
}
