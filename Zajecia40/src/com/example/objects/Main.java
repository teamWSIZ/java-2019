package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(7, 6, 5, 10, 3, 2, 1, 0));

        Main app = new Main();

        var noIteration = app.sort(array,false);
        System.out.println("Liczba wejść do pętli: " + noIteration);

        System.out.println(array);
    }

    public int standardSort(ArrayList<Integer> array,boolean print){
        array.sort((n0, n1) -> {
            System.out.println(array);
            return Integer.compare(n0, n1);
        });

        return 0;
    }

    public int sort(ArrayList<Integer> array,boolean print) {
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

                    if(print)
                        System.out.println(array);
                }

                noIteration++;
            }

            lengthToSort = lengthToSort - 1;

            if(print)
                System.out.println("------------------");
        }

        return noIteration;
    }


}
