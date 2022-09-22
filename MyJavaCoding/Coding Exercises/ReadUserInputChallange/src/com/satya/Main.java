package com.satya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while(counter <= 10){
            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else {
                System.out.println("Invalid number.");
            }
            scanner.nextLine();
        }
        System.out.println(sum);

        scanner.close();
    }
}
