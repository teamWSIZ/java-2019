package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        //Optional<Integer> optional = Optional.of(10);

        new Main().example1();
    }

    void example1(){
        List<String> arrayList = Arrays.asList("a","b","c","d","e","f","g");
        Stream<String> stream = arrayList.stream();

        String element = arrayList.stream().findFirst().get();
        System.out.println("Pierwszy element: "+element);
        arrayList.stream().forEach(System.out::println);

    }
}
