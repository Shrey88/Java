package com.oops.challenge;

import org.w3c.dom.ls.LSOutput;

public class HamBurger {
    private String name;
    private String bread_roll_type;
    private String meat;
    private double hamburger_price;
    private boolean add_lettuce;
    private boolean add_tomato;
    private boolean add_onion;
    private boolean add_carrot;
    private double lettuce_price = 0.70;
    private double tomato_price = 0.35;
    private double carrot_price = 0.35;
    private double onion_price = 0.45;
    private double final_price = 0.0;

    public HamBurger(String bread_roll_type, String meat){
        this("Basic", bread_roll_type, meat, 1.50);

        this.add_carrot = false;
        this.add_onion = false;
        this.add_tomato = false;
        this.add_lettuce = false;
    }
    public HamBurger(String name, String bread_roll_type, String meat, double price){
        this.name = name;
        this.bread_roll_type = bread_roll_type;
        this.meat = meat;
        this.hamburger_price = price;

        this.add_carrot = false;
        this.add_onion = false;
        this.add_tomato = false;
        this.add_lettuce = false;

        this.final_price += this.hamburger_price;
    }

    private void lettuce(){
        this.final_price += lettuce_price;
        this.add_lettuce = true;
    }

    private void tomato() {
        this.final_price += tomato_price;
        this.add_tomato = true;
    }

    private void carrot() {
        this.final_price += carrot_price;
        this.add_carrot = true;
    }

    private void onion() {
        this.final_price += onion_price;
        this.add_onion = true;
    }

    public void addLettuce(){
        lettuce();
    }

    public void addTomato(){
        tomato();
    }

    public void addOnion(){
        onion();
    }

    public void addCarrot(){
        carrot();
    }
    public void setHamburger_price(double price){
        this.hamburger_price = price;
    }

    public String getName() {
        return name;
    }

    public String getBread_roll_type() {
        return bread_roll_type;
    }

    public String getMeat() {
        return meat;
    }

    public double getHamburger_price() {
        return hamburger_price;
    }

    public double getLettuce_price() {
        return lettuce_price;
    }

    public double getTomato_price() {
        return tomato_price;
    }

    public double getCarrot_price() {
        return carrot_price;
    }

    public double getOnion_price() {
        return onion_price;
    }

    public double getFinal_price() {
        return final_price;
    }

    public void setFinal_price(double final_price){
        this.final_price = final_price;
    }

    public boolean isAdd_lettuce() {
        return add_lettuce;
    }

    public boolean isAdd_tomato() {
        return add_tomato;
    }

    public boolean isAdd_onion() {
        return add_onion;
    }

    public boolean isAdd_carrot() {
        return add_carrot;
    }

    public void showMenu(){
        System.out.println("Hamburger : $" + getHamburger_price());

        System.out.println("Add-on : ");

        System.out.println("==================");
        System.out.println("Lettuce : $" + getLettuce_price());
        System.out.println("Tomato  : $" + getTomato_price());
        System.out.println("Carrot  : $" + getCarrot_price());
        System.out.println("Onion   : $" + getOnion_price());
    }

    public void finalOrder(){
        System.out.println("Order:");
        System.out.println("====================");

        System.out.println(getName() + " Hamburger" + " with " + getBread_roll_type() + " bread  : $" +
                getHamburger_price());
        System.out.println("Add-on added : ");
        if(isAdd_lettuce())
            System.out.println("    Lettuce     : $" + getLettuce_price());
        if(isAdd_tomato()) {
            System.out.println("    Tomato      : $" + getTomato_price());
        }
        if(isAdd_carrot()) {
            System.out.println("    Carrot      : $" + getCarrot_price());
        }
        if(isAdd_onion()) {
            System.out.println("    Onion       : $" + getOnion_price());
        }

        System.out.println("==================");
        System.out.println("Total Bill : " + getFinal_price());
    }

}
