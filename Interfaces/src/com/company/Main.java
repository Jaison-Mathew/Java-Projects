package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567890);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567890);
        timsPhone.answer();


        timsPhone = new MobilePhone(23435);
        timsPhone.powerOn();
        timsPhone.callPhone(23435);
        timsPhone.answer();
    }
}
