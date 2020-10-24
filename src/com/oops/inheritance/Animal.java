package com.oops.inheritance;

/*
 *
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    Animal(){
        this(null, 0, 0, 0, 0);
        System.out.println("Default Animal Constructor called");
    }

    Animal(String name, int brain, int body, int size, int weight){
        System.out.println("Paramerterized Animal Constructor called");
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() method is called");
    }

    public void move(){
        System.out.println("Animal.move() method is called");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
