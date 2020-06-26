package com.example.generics.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        MyClass<Double> myClass = new MyClass<>();
        List<Integer> array1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Double> array2 = Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0);

        myClass.printArray(array2);

        //To nie będzie działało
        //myClass.printArray(array1);

        myClass.nextPrint(array1);
        myClass.nextPrint(array1);
    }



}
