package com.satya;

public class Main {
    public static void main(String[] args) {

        int switchValue= 4;
        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value can be 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value is not present");
                break;
        }

        char switchValue1= 'D';
        switch (switchValue1){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value can be C or D or E");
                System.out.println("Actually it was a " + switchValue1);
                break;
            default:
                System.out.println("Value is not present");
                break;
        }

    }
}
