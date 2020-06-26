package com.example.generics.functions;

import java.util.List;

class MyClass<T>{
    List<T> array;
    MyClass(){
    }
    MyClass(List<T> array){
        this.array = array;
    }

    void printArray(List<T> data){
        data.forEach(System.out::println);
    }

    <U> void nextPrint(List<U> data){
        data.forEach(System.out::println);
    }
}
