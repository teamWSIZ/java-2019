package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
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

        Main main = new Main();
        main.example1();
        main.example2();
    }

    void example1(){
        List<String> arrayList = Arrays.asList("a","b","cd","d","e","f","g");
        Stream<String> stream = arrayList.stream();

        String element = arrayList.stream().findFirst().get();
        System.out.println("Pierwszy element: "+element);
        arrayList.stream().forEach(System.out::println);

        System.out.println("-----------------------------");
        arrayList.stream().filter(e->e.contains("d")).forEach(System.out::println);
    }

    void example2(){
        int no = 0;
        final int[] arrayInt = new int[]{0};

        Supplier<Integer> supplier = ()->{
            return arrayInt[0]++;
        };
        Stream<Integer> stream = Stream.generate(()->(int)(Math.random()*10)).limit(10);
        Stream<Integer> stream1 = Stream.generate(supplier).limit(50).map(e->e*e).filter(e->e<200);
        stream.forEach(System.out::println);
        stream1.forEach(System.out::println);
    }
}
