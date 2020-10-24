package com.oops.encapsulation;

public class Printer {
    private int toner_level = 100;
    private int pages_printed = 0;
    private int pages = 50;
    private boolean printBothSides;

    Printer(){

    }

    public void fill_toner(){
        System.out.println("Current Toner Level : " + getToner_level() + "%");
        if(getToner_level() >= 0 && getToner_level() < 100){
            int newToner = 100 - getToner_level();
            toner_level = getToner_level() + newToner;
            System.out.println("Added " +newToner+"% of toner");
        }else if (getToner_level() == 100){
            System.out.println("Toner Level is already 100%");
        }
    }

    public void addPages(){
        System.out.println("Current no of pages : " + getPages() );
        if(getPages() >= 0 && getPages() < 100){
            int newPages = 100 - getPages();
            pages = getPages() + newPages;
            System.out.println("Added " +newPages+"% of toner");
        }else if (getPages() == 100){
            System.out.println("Toner Level is already 100%");
        }
    }

    public void printPages(int no_of_pages, boolean printBothSides){
        for (int i = 0; i < Math.round(no_of_pages / 2); i++) {
            if(printBothSides) {
                if (getPages() >= Math.round(no_of_pages / 2) && getToner_level() >= 5) {
                    System.out.println("Printing in duplex mode");
                    pages_printed += 1;
                    System.out.println(Math.round(no_of_pages / 2) + " pages printed.");

                    setToner_level(5);
                    setPages(1);

                    System.out.println("Pages Left : " + getPages());
                    System.out.println("Toner Level: " + getToner_level());
                    System.out.println("");

                } else if (getPages() < Math.round(no_of_pages / 2)) {
                    System.out.println("Please add some more pages");
                } else {
                    System.out.println("Please refill the toner");
                }
            }
            else{
                    if (getPages() >= no_of_pages && getToner_level() >= 10) {
                        System.out.println("Printing in non-duplex mode");
                        pages_printed += 1;
                        System.out.println(no_of_pages + " pages printed.");

                        setToner_level(10);
                        setPages(1);

                        System.out.println("Pages Left : " + getPages());
                        System.out.println("Toner Level: " + getToner_level());
                        System.out.println("");

                    } else if (getPages() < no_of_pages) {
                        System.out.println("Please add more pages");
                    } else {
                        System.out.println("Please refill the toner");
                    }
                }
        }
    }

    public void getPages_printed() {
        System.out.println("Total no of pages printed : " + pages_printed);
    }

    private int getToner_level(){
        return toner_level;
    }

    private int getPages(){
        return pages;
    }

    private void setToner_level(int toner_level){
        this.toner_level -= toner_level;
    }

    private void setPages(int pages){
        this.pages -= pages;
    }
}
