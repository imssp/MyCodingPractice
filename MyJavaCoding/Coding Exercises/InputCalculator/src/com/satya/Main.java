package com.satya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0, counter = 0;
        while(true){

            boolean validity = scanner.hasNextInt();

            if(validity){

               int n = scanner.nextInt();
               sum += n; counter++;
            }else{
                break;
            }
        }
        int avg = (int) Math.round((double)sum/counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.nextLine();
        scanner.close();
    }

}
