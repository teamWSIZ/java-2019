package com.example.generics.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,10);
    List<Double> array2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
    List<String> namesArray = Arrays.asList("a","b","c","d","e","f","g","h","i","j");

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
            printTwoArrays(array1, namesArray);

        } catch (Exception e) {
            System.out.println("Nie udało się wyświetlić tablic: " + e.getMessage());
        }
    }

    <T,U> void printTwoArrays(List<T> data1, List<U> data2) throws Exception {
        //Przemysław: 174

        if (data1.size() != data2.size()) {
            throw new Exception("Tablice posiadają inną długość");
        }

        int index = 0;

        for(T element: data1){
            System.out.println(element+" : "+data2.get(index));
            index++;
        }

    }

}
