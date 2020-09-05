package com.example.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> stream = list.stream().map(a->a*a);

        //List<Integer> list1 = stream.collect(Collectors.toList());
        //System.out.println(list1);

        ArrayList<Integer> array = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(array);

        Main main = new Main();
        main.example1();
        main.example2();
    }

    void example1(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ArrayList<Integer> array = list.stream().map(a->a*a*a).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(array);

        final int[] array1 = new int[]{0};

        IntStream stream = IntStream.generate(()->(array1[0]++)).limit(100);
        stream.forEach(System.out::println);
    }

    void example2(){
        final int[] array1 = new int[]{0};

        IntStream stream = IntStream.generate(()->(array1[0]++)).limit(100);
        stream.forEach(System.out::println);
    }

}
