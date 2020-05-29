package com.example.innerclass;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

class OuterClass {
    private Double number;

    OuterClass(Double number) {
        this.number = 1.0;
    }

    class ClassA {
        @Override
        public String toString() {
            return "ClassA number:" + number;
        }

    }

    static class ClassB {
        @Override
        public String toString() {
            return "ClassB";
        }

        static class nextClass {
            @Override
            public String toString() {
                return "nextClass";
            }
        }
    }

    @Override
    public String toString() {
        return "OuterClass";
    }
}

public class Main {
    ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
        main.example1();

        main.example2();

    }

    void example() {
        OuterClass outerClass = new OuterClass(5.0);
        var outerClass1 = new OuterClass(10.0);

        System.out.println(outerClass1);

        OuterClass.ClassA classA = outerClass.new ClassA();
        System.out.println(classA);

        OuterClass.ClassB classB = new OuterClass.ClassB();

        var classB1 = new OuterClass.ClassB();
        System.out.println(classB);

        var nextClass = new OuterClass.ClassB.nextClass();
        System.out.println(nextClass);
    }

    void example1(){
        class SimpleClass{
            @Override
            public String toString() {
                return "simpleClass";
            }
        }

        System.out.println(new SimpleClass());

        abstract class ClassAbstract{
            abstract public void printText(String text);
        }

        var classAbstract = new ClassAbstract(){

            @Override
            public void printText(String text) {
                System.out.println("Wprowadzono: "+text);
            }
        };

        classAbstract.printText("napis");
    }

    void example2(){
        for(int i=0;i<10;i++)
            array.add(i);

        array.forEach(v->System.out.println(v));
        array.forEach(System.out::println);

        Function<String ,Double> methodReference = Main::print;

        methodReference.apply("Przykładowy tekst");
    }

    static Double print(String text){
        System.out.println("Metoda print klasy main: "+text);

        return 0.0;
    }
}
