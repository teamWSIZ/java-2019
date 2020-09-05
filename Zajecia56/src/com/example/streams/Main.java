package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> stream = list.stream().map(a->a*a);

        List<Integer> list1 = stream.collect(Collectors.toList());
        System.out.println(list1);
    }
}
