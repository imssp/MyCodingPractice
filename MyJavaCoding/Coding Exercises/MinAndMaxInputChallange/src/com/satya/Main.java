package com.satya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int min = 0, max = 0;

        int n = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter Number:");
            boolean validity = scanner.hasNextInt();
            if(validity){
                n = scanner.nextInt();
                if(first){
                    first = false;
                    max = n; min = n;
                }
                min= Math.min(min, n);
                max= Math.max(max, n);
            } else{
                System.out.println("Maximum: " + max + " Minimum: " + min);
                break;
            }

            scanner.nextLine(); // handle input
        }

        scanner.close();

    }
}
