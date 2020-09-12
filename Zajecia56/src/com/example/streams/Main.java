package com.example.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
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

        list.stream().map(e->e*e).filter(e->e>20).forEach(System.out::println);


        Main main = new Main();
        //main.example1();
        //main.example2();

        IntSupplier randomSupplier = ()->(int)(Math.random()*10);

        var time = System.currentTimeMillis();
        var sum = IntStream.generate(randomSupplier).limit(10000000).map(e->e*e).parallel().sum();
        var elapsedTime = System.currentTimeMillis()-time;
        System.out.println("Suma wynosi: " + sum + " ,Czas obliczeń: "+elapsedTime+" [ms]");
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

        IntStream stream = IntStream.generate(()->(array1[0]++)).limit(5);
        //stream.forEach(System.out::println);


        Integer no = stream.reduce((a,b)->{
            System.out.println("accumulator: "+a);
            System.out.println("current: "+b);
            return a+10;
        }).getAsInt();

        System.out.println(no);
    }

}
