package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        double myVar1 = 20.00;
        double myVar2 = 80.00;

        double myRemainder = ((myVar1 + myVar2) * 100.00) % 40.00;

        boolean divisibleOrNot = myRemainder == 0 ? true : false;

        System.out.println(divisibleOrNot);

        if (!divisibleOrNot){
            System.out.println("Got some Remainder");
        }
    }
}
