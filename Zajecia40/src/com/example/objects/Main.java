package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class sortInfo{
    public int noIteration;
    public long time;

    sortInfo(int noIteration, long time){
        this.noIteration = noIteration;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ilość iteracji: "+noIteration+" czas wykonania:"+time+"ms";
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        Main app = new Main();

        app.generateData(array,10);
        System.out.println(array);

        ArrayList<Integer> array1 = new ArrayList<>();
        app.generateData(array1,10);

        System.out.println(array);

        var sortInfo = app.sort(array,false);

        System.out.println("Sortowanie bąbelkowe: " + sortInfo);

        sortInfo = app.standardSort(array1,false);
        System.out.println("Sortowanie Java: " + sortInfo);
    }

    public void generateData(ArrayList<Integer> array,int noValues){
        Random random = new Random();
        random.setSeed(10);

        for(int i=0;i<noValues;i++)
            array.add(random.nextInt(100));
    }

    public sortInfo standardSort(ArrayList<Integer> array,boolean print){
        var startTime = System.currentTimeMillis();
        final int[] noIteration = {0};

        array.sort((n0, n1) -> {
            noIteration[0]++;
            if(print)
                System.out.println(array);
            return Integer.compare(n0, n1);
        });

        var endTime = System.currentTimeMillis();

        return new sortInfo(noIteration[0],endTime-startTime);
    }

    public sortInfo sort(ArrayList<Integer> array,boolean print) {
        var startTime = System.currentTimeMillis();
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
        var endTime = System.currentTimeMillis();

        return new sortInfo(noIteration,endTime-startTime);
    }


}
