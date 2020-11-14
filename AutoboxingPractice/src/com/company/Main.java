package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.23);

        //autoboxing to get value from primitive int value to Integer class
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        //unboxing to get value from Integer class value to primitive int value
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " = " + intArrayList.get(i).intValue());
        }

        ArrayList<Double> myDoubleVal = new ArrayList<Double>();
        for (double j = 0.0; j<= 10.0; j += 0.5){
            myDoubleVal.add(Double.valueOf(j));
        }

        for (int x =0; x < myDoubleVal.size(); x++){
            double val = myDoubleVal.get(x).doubleValue();
            System.out.println(x + " = " + val);
        }

    }
}
