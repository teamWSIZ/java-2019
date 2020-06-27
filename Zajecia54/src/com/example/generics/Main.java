package com.example.generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

class A{

}
class B extends A{

}
class B1 extends A{

}
class C extends B{
    void print(){
        System.out.println("Tutaj pojawiła się nowa funkcja");
    }
}
class D extends C{

}
class E extends D{

}

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        //A->B->C->D->E
        //A->B1->C->D->E
        C c = new C();
        c.print();
        D d = new D();
        d.print();

        ArrayList<A> arrayA = new ArrayList<>();
        // to nie zadziała funE(arrayA);

        ArrayList<C> array = new ArrayList<>();
        ArrayList<D> array1 = new ArrayList<>();
        funE(array);
        funE(array1);
    }

    void funE(@NotNull ArrayList<? extends C> data){
        //A->B->C->D->E
        //Działa od tego momentu: C->D->E, tutaj pojawiła się funkcja print
        data.forEach(C::print);
    }
    void funS(){

    }
}
