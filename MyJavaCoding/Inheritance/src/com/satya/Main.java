package com.satya;

public class Main {
    public static void main(String[] args) {

        Animal animal= new Animal("Animal", 1 ,1, 5 ,5);

        Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 1, "long");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
