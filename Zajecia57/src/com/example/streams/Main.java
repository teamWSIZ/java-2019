package com.example.streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IntStream intStream = IntStream.generate(()->(int)(Math.random()*10)).limit(100000);

        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0;i<10;i++)
            array.add(i);

        Main main = new Main();

        double average = main.average(array);

    }

    double average(ArrayList<Integer> arrayList){
        double average = 0;
        return average;
    }

}
