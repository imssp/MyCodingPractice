package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string.";
        System.out.println("myString is = " + myString);
        myString = myString + ". and this is more.";
        System.out.println("myString is = " + myString);
        myString = myString + "\u00A9 2022";
        System.out.println("myString is = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myint = 50;
        double myDouble = 120.34d;
        lastString = lastString + myint + myDouble;
        System.out.println(lastString);


    }
}