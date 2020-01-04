package com.example.arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> tablica = new ArrayList<>();

        tablica.add(20);

        for(int i=0;i<=10;i++)
            tablica.add((int)Math.pow(i,4));

        tablica.addAll(tablica);

        for(int i=0;i<tablica.size();i++)
            System.out.println(tablica.get(i));


    }
}
