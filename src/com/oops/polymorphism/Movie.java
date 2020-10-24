package com.oops.polymorphism;

/*
 * In polymorphism we can override the base class methods in the derived
 * class
 *
 * so when you create an object of the derived class and it is being referred
 * by the base class and you call the method that is overridden it will look into
 * the derived class of which the object is created
 *
 * if it finds the method in the derived class then it executes it else
 * base class method will get executed.
 */
public class Movie {

    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}


class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return ("Kids try and escape a maze");
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return ("Imperial Forces try to take over the universe");
    }
}

class Forgetable extends Movie{

    public Forgetable(){
        super("Forgetable");
    }

    // plot method is not overridden
}