package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> array = new ArrayList<>();
        array.add(40);
        array.addAll(Arrays.asList(10,1,2,3,4,5,6));

        System.out.println(array);

        Main app = new Main();
        app.sort(array);

        array.set(0,50);
        array.add(0,100);

        System.out.println(array);

    }

    public void sort(ArrayList<Integer> array){
        //[20, 1, 5, 3, 5, 6, 7, 8, 10]
        //[1, 20, 5, 3, 5, 6, 7, 8, 10]
        //[1, 5, 20, 3, 5, 6, 7, 8, 10]
        //[1, 5, 3, 20, 5, 6, 7, 8, 10]
    }


}
