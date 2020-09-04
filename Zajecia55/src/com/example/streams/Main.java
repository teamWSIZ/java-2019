package com.example.streams;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<10;i++)
            array.add(i);

        System.out.println(array);

        ArrayList<Integer> array1 = new ArrayList<>();

        for(Integer element : array){
            array1.add(element*element);
        }

        System.out.println(array1);
    }
}
