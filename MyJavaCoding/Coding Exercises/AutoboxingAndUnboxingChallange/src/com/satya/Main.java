package com.satya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank("Nation Indian Bank");

        if(bank.addBranch("Kolkata")){
            System.out.println("Kolkata branch created");
        }
        bank.addCustomer("Kolkata", "Satya", 50.05);
        bank.addCustomer("Kolkata", "Patel", 26.32);
        bank.addCustomer("Kolkata", "Sai", 524.22);

        bank.addBranch("Bhubaneswar");
        bank.addCustomer("Bhubaneswar", "Rai", 96.25);

        bank.addCustomerTransaction("Kolkata", "Satya", 548.2);
        bank.addCustomerTransaction("Kolkata", "Satya", 7.52);
        bank.addCustomerTransaction("Kolkata", "Patel", 23.22);

        bank.listCustomers("Kolkata", true);
        bank.listCustomers("Bhubaneswar", true);

        if(!bank.addCustomer("Burla", "Tim", 5.22)){
            System.out.println("Burla branch does not exist.");
        }
        if(!bank.addBranch("Kolkata")){
            System.out.println("Kolakta branch exists already.");
        }
        if(!bank.addCustomerTransaction("Kolkata", "jacob", 64.25)){
            System.out.println("Customer doesnt exist");
        }

        if(!bank.addCustomer("Kolkata", "Satya", 65.25)){
            System.out.println("Customer already exists");
        }
    }

}
