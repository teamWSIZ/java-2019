package com.example.generics;

class A{

}
class B extends A{

}
class B1 extends A{

}
class C extends B{

}
class D extends C{

}
class E extends D{

}

public class Main {

    public static void main(String[] args) {
        //A->B->C->D-E
        //A->B1->C->D-E
    }
}
