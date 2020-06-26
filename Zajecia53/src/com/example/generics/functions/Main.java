package com.example.generics.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,10);
    List<Double> array2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);

    public static void main(String[] args) {
        Main main = new Main();
        // to test sparamtryzowanego obiektu main.example();
        main.example1();
    }

    void example() {
        MyClass<Double> myClass = new MyClass<>();

        myClass.printArray(array2);

        //To nie będzie działało
        //myClass.printArray(array1);

        myClass.nextPrint(array1);
        myClass.nextPrint(array1);
    }

    void example1(){
        try {
            printTwoArrays(array1, array2);
        } catch (Exception e) {
            System.out.println("Nie udało się wyświetlić tablic: " + e.getMessage());
        }
    }

    void printTwoArrays(List<Integer> data1, List<Double> data2) throws Exception {
        //Przemysław: 174

        if (data1.size() != data2.size()) {
            throw new Exception("Tablice posiadają inną długość");
        }

        int index = 0;

        for(Integer element: data1){
            System.out.println(element+" : "+data2.get(index));
            index++;
        }

    }

}
