package com.oops.abstract_class;


/*
 *  lets see what is the difference between interface and and an abstract class
 *  and also we will see how we go about deciding which one to use.
 *
 *  we need to consider the relationships, is-a or has-as relationship
 *  for example dog is an animal, bird is an animal. This makes sense to inherit from an animal class
 *  rather than implementing an actual animal interface
 *
 *  but birds aren't the only animals that can fly. for example bats, dragonflies can also fly.
 *
 *  to get around that we could rename our bird class flying animals and have bats and bird both inherit from that.
 *
 *  Now bats give birth to young ones rather than laying eggs.
 *
 *  a better design would be to create a canfly interface which both bats and bird can implement.
 *
 *
 *  Difference between Interface and Abstract
 * ===================================================
 *  abstract class can have a member variable that can be inherited but this can't be done with interface.
 *
 *  interfaces can have variables, but they're all public static final variables which are essentially gonna
 *  be constant values that should never change with a static scope.
 *
 *  They have to be static, because non static variables require an instance and you can't instantiate
 *  an interface.
 *
 *  Interfaces cannot have the constructors, but abstract classes can have.
 *
 *  all the methods inside the interfaces are automatically public and abstract
 *  whereas the methods of an abstract class can have any visibility Private, Protected, public.
 *
 *  Abstract classes can have defined methods i.e methods with an implementation
 *
 *  in abstract class you want to declare non static or non final fields, this enables you to define
 *  methods that can access and modify the state of an object
 *
 *  The purpose of an abstract class is to provide a common definition of base class that multiple derived
 *  classes can share
 *
 *  Interface can extend another interface
 *
 *  NOTE: Since Java8 interfaces can contain default methods. In other words methods with implementation.
 *  The keyword default is used (mostly for backwards compatibility), and static methods as well before Java8
 *  that was not possible.
 *
 *  NOTE: Since Java 9 an interface can also contain private methods (commonly used when two default methods in an
 *  interface share common code)
 *
 *
 *  When to use Interface
 *  ==================================
 *  you expect that unrelated classes will implement your interface. for .e.g the interfaces comparable
 *  and cloneable are implemented by many unrelated classes.
 *
 *  You want to specify the behavior of a particular data type, but  you are not concerned about
 *  who implements its behavior
 *
 *  you want to separate different behavior.
 *
 *  The Collections API is an excellent example, we have the List interface and implementations ArayList and
 *  LinkedList
 *
 *  The JDBC API is another excellent example. IT exist of almost only interfaces. The concrete implementations are
 *  provided as "JDBC drivers". This enables you to write all the JDBC code independent of the database(DB) vendor.
 */
public interface CanFly {

    void fly();
}
