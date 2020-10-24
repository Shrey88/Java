package com.oops.interfaces;

public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone;   // you cannot use new operator to initiate the interface class
                                // by doing so it will automatically adds an override methods to create a class

        timsPhone = new DeskPhone(123455);
        timsPhone.powerOn();
        timsPhone.callPhone(123455);
        timsPhone.answer();

        timsPhone = new MobilePhone(422557);
        timsPhone.powerOn();
        timsPhone.callPhone(422557);
        timsPhone.answer();
    }
}
