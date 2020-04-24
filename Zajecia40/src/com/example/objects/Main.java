package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> array = new ArrayList<>();
        //array.add(40);
        array.addAll(Arrays.asList(10, 1, 2, 3, 4, 5, 6));

        Main app = new Main();
        app.sort(array);

        System.out.println(array);

        boolean swapped = false;

        for (int i = 0; i < array.size() - 1; i++) {

            var n0 = array.get(i);
            var n1 = array.get(i+1);

            if (n0 > n1) {
                array.set(i, n1);
                array.set(i+1, n0);

                swapped = true;

                System.out.println(array);
            }
        }

        if(swapped==true)
            System.out.println("Wykonano przestawienie...");
        else
            System.out.println("Macierz jest już posortowana");

    }

    public void sort(ArrayList<Integer> array) {
        //[20, 1, 5, 3, 5, 6, 7, 8, 10]
        //[1, 20, 5, 3, 5, 6, 7, 8, 10]
        //[1, 5, 20, 3, 5, 6, 7, 8, 10]
        //[1, 5, 3, 20, 5, 6, 7, 8, 10]
    }


}
