package com.satya;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Satya", 54.65);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println(customer.getName() + "  " + customer.getBalance());
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
