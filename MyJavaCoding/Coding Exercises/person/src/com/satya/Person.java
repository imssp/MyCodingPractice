package com.satya;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        else this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        if(this.age > 12 || this.age < 20) return true;
        else return false;
    }

    public String getFullName(){
        if( this.firstName.isEmpty() == false && this.lastName.isEmpty() == false)
            return (this.firstName + " " + this.lastName);
        else return (this.firstName + this.lastName);
    }
}
