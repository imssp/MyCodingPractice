package academy.learnprogramming;

public class Main {
    public static void main(String[] args){

        byte myByte = 125;
        short myShort = 32765;

        int myInt = 10_000_000;

        long myLong =(5000 + (10 * (myByte + myInt + myShort)));
        System.out.println(myLong);
    }
}
