package com.satya;

public class Main {
    public static void main(String[] args) {
        ITelephone satyasPhone;
        satyasPhone = new DeskPhone(123456789);
        satyasPhone.powerOn();
        satyasPhone.callPhone(123456789);
        satyasPhone.answer();

        satyasPhone = new MobilePhone(789456);
        //satyasPhone.powerOn();
        satyasPhone.callPhone(789456);
        satyasPhone.answer();
    }
}
