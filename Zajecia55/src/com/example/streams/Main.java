package com.example.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

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

        Stream<String> stream = Stream.empty();
        Stream<Integer> arrayStream = array.stream();

        System.out.println(arrayStream.findFirst().get());

        Optional<Integer> optional = Optional.of(10);
    }
}
