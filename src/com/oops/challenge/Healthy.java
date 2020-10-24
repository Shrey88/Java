package com.oops.challenge;

public class Healthy extends HamBurger{

    private boolean add_jalpenos;
    private boolean add_olives;
    private double jalpeno_price;
    private double olives_price;

    public Healthy(String bread_roll_type, String meat){
        super("Healthy", bread_roll_type, meat,5.75);
        this.add_jalpenos = false;
        this.add_olives = false;
        this.jalpeno_price = 0.50;
        this.olives_price = 0.90;
    }

    private double getJalpeno_price(){
        return jalpeno_price;
    }

    private double getOlives_price(){
        return olives_price;
    }

    private void jalpenos(){
        this.setFinal_price(this.getFinal_price() + this.jalpeno_price);
        this.add_jalpenos = true;
    }

    private void olives(){
        this.setFinal_price(this.getFinal_price() + this.olives_price);
        this.add_olives = true;
    }

    public void add_jalpenos(){
        jalpenos();
    }

    public void add_olives(){
        olives();
    }

    @Override
    public void showMenu() {
        super.showMenu();
        System.out.println("Jalpenos   : $" + jalpeno_price);
        System.out.println("Olives     : $" + olives_price);
    }

    @Override
    public void finalOrder() {
        System.out.println("Order:");
        System.out.println("====================");

        System.out.println(getName() + " Hamburger" + " with " + getBread_roll_type() + " bread  : $" +
                getHamburger_price());
        System.out.println("Add-on added : ");
        if(isAdd_lettuce())
            System.out.println("    Lettuce         : $" + getLettuce_price());
        if(isAdd_tomato()) {
            System.out.println("    Tomato          : $" + getTomato_price());
        }
        if(isAdd_carrot()) {
            System.out.println("    Carrot          : $" + getCarrot_price());
        }
        if(isAdd_onion()) {
            System.out.println("    Onion           : $" + getOnion_price());
        }
        if(add_jalpenos)
            System.out.println("    Jalpenos        : $" + getJalpeno_price());
        if(add_olives) {
            System.out.println("    Olives          : $" + getOlives_price());
        }


        System.out.println("==================");
        System.out.println("Total Bill : " + getFinal_price());
    }
}
