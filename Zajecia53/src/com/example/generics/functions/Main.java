package com.example.generics.functions;

import java.util.ArrayList;

class MyClass<T>{
    ArrayList<T> array;
    MyClass(ArrayList<T> array){
        this.array = array;
    }

    void printArray(ArrayList<T> data){
        data.forEach(System.out::println);
    }
}


public class Main {

    public static void main(String[] args) {
    }


}
