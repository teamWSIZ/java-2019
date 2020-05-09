package com.example.innerclass;

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

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
        main.example1();
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
}
