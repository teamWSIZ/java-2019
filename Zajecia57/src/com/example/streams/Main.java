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
        System.out.println("Średnia: "+average);

        double streamAverage = IntStream.generate(()->(int)(Math.random()*10)).limit(100000).average().getAsDouble();
        System.out.println("Średnia stream: "+streamAverage);

    }

    double average(ArrayList<Integer> arrayList){
        double sum = 0;
        for(double e : arrayList)
            sum+=e;

        return sum/arrayList.size();
    }

}
