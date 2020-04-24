package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> array = new ArrayList<>();
        //array.add(40);
        array.addAll(Arrays.asList(7, 6, 5, 10, 3, 2, 1, 0));

        /*array.sort((n0, n1) -> {
            System.out.println(array);
            return Integer.compare(n0, n1);
        });*/

        System.out.println(array);

        Main app = new Main();
        app.sort(array);

        System.out.println(array);

        boolean swapped = true;

        int noIteration = 0;
        int lengthToSort = array.size() - 1;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < lengthToSort; i++) {

                var n0 = array.get(i);
                var n1 = array.get(i + 1);

                if (n0 > n1) {
                    array.set(i, n1);
                    array.set(i + 1, n0);

                    swapped = true;

                    System.out.println(array);
                }

                noIteration++;
            }

            lengthToSort = lengthToSort - 1;
            System.out.println("------------------");
        }

        System.out.println("Liczba wejść do pętli: " + noIteration);
    }

    public void sort(ArrayList<Integer> array) {
        //[20, 1, 5, 3, 5, 6, 7, 8, 10]
        //[1, 20, 5, 3, 5, 6, 7, 8, 10]
        //[1, 5, 20, 3, 5, 6, 7, 8, 10]
        //[1, 5, 3, 20, 5, 6, 7, 8, 10]
    }


}
