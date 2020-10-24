package com.oops.encapsulation;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.printPages(5, true);
        printer.printPages(10, false);
        printer.printPages(10, false);
        printer.printPages(10, false);
        printer.printPages(10, false);
        printer.printPages(10, false);



        printer.getPages_printed();
    }
}
