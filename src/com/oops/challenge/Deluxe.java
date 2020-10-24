package com.oops.challenge;

public class Deluxe extends HamBurger{

    private double coke_price;
    private double chips_price;
    private boolean add_coke;
    private boolean add_chips;



    public Deluxe(String bread_roll_type, String meat){
        super("Deluxe", bread_roll_type, meat,4.25);


        this.coke_price = 1.00;
        this.chips_price = 1.00;
        this.add_coke = false;
        this.add_chips = false;
    }

    private double getCoke_price() {
        return coke_price;
    }

    private double getChips_price() {
        return chips_price;
    }

    private void coke(){
        this.setFinal_price(this.getFinal_price() + this.coke_price);
        this.add_coke = true;
    }

    private void chips(){
        this.setFinal_price(this.getFinal_price() + this.chips_price);
        this.add_chips = true;
    }

    public void add_coke(){
        coke();
    }

    public void add_chips(){
        chips();
    }


    @Override
    public void showMenu() {
        super.showMenu();
        System.out.println("Chips   : $" + chips_price);
        System.out.println("Coke     : $" + coke_price);
    }

    @Override
    public void addCarrot() {
        System.out.println("Carrot add-on not applicable in Deluxe");
    }

    @Override
    public void addLettuce() {
        System.out.println("Lettuce add-on not applicable in Deluxe");
    }

    @Override
    public void addOnion() {
        System.out.println("Onion add-on not applicable in Deluxe");
    }

    @Override
    public void addTomato() {
        System.out.println("Tomato add-on not applicable in Deluxe");
    }

    @Override
    public void finalOrder(){
        System.out.println("Order:");
        System.out.println("====================");

        System.out.println(getName() + " Hamburger" + " with " + getBread_roll_type() + " bread  : $" +
                getHamburger_price());
        System.out.println("Add-on added : ");
        if(add_coke)
            System.out.println("    Coke     : $" + getCoke_price());
        if(add_chips) {
            System.out.println("    Chips    : $" + getChips_price());
        }


        System.out.println("==================");
        System.out.println("Total Bill : " + getFinal_price());
    }
}
