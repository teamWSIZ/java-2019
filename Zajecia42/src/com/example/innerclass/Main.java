package com.example.innerclass;

class OuterClass{
    class ClassA{
        @Override
        public String toString() {
            return "ClassA";
        }

    }

    static class ClassB{
        @Override
        public String toString() {
            return "ClassB";
        }

        static class nextClass{
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
	// write your code here
        Main main = new Main();
        main.example();
    }

    void example(){
        OuterClass outerClass = new OuterClass();
        var outerClass1 = new OuterClass();

        System.out.println(outerClass1);

        OuterClass.ClassA classA = outerClass.new ClassA();
        System.out.println(classA);

        OuterClass.ClassB classB = new OuterClass.ClassB();

        var classB1 = new OuterClass.ClassB();
        System.out.println(classB);

        var nextClass = new OuterClass.ClassB.nextClass();
        System.out.println(nextClass);
    }
}
