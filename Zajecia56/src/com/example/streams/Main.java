package com.example.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
    }

    void example1(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ArrayList<Integer> array = list.stream().map(a->a*a*a).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(array);
    }
}
