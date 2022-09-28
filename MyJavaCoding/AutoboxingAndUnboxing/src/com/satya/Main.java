package com.satya;

import java.util.AbstractList;
import java.util.ArrayList;

class IntClass{
    private int myvalue;

    public IntClass(int myvalue) {
        this.myvalue = myvalue;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.23);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println( i + " --> " + value);
        }
    }
}
