package com.example.generics;

import java.util.ArrayList;
import java.util.Arrays;

class A{
    void simpleEquation(){
        System.out.println("Tutaj coś obliczamy");
    }
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
    @Override
    void simpleEquation(){
        System.err.println("Ta funkcja została zastąpiona inną");
    }
}
class E extends D{

}

public class Main {

    ArrayList<Integer> integerArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0));

    ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j"));

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
        // to nie zadziała
        // funE(arrayA);

        ArrayList<C> array = new ArrayList<>();
        ArrayList<D> array1 = new ArrayList<>();

        funE(array);
        funE(array1);

        funS(array);
        //To nie zadziała
        // funS(array1);

        try {
            // printTwoArrays(integerArray,doubleArray);
            // printTwoArrays(integerArray,stringArray);
            printTwoArraysSum(integerArray,integerArray);
            // ta metoda nie kompiluje sie, wymaga obu typow integer
            // printTwoArraysSum(integerArray,doubleArray);

            //Tutaj pomaga dodanie <T,U> jednak pojawia sie problem z typem integer
            //printTwoArraysSum1(integerArray,doubleArray);

            printTwoArraysSumExtends(integerArray,doubleArray);
            // printTwoArraysSumExtends(integerArray,stringArray) z tablica tekstowa nie kompiluje sie;

            //Natomiast funkcja po wczytaniu tablicy z elementami string nie dziala
            //printTwoArraysSum1(integerArray,stringArray);


        } catch (Exception e) {
            e.printStackTrace();
        }

        Number a = 1.0;
        Number b = 1;

        Number sum = Double.parseDouble(a.toString())+Double.parseDouble(b.toString());
        System.out.println(sum);

        //System.out.println("a = "+a+" a1= "+a1);

    }

    void funE(ArrayList<? extends C> data){
        //A->B->C->D->E
        //Działa od tego momentu: C->D->E, tutaj pojawiła się funkcja print
        data.forEach(C::print);
    }
    void funS(ArrayList<? super C> data){
        //A->B->C->D->E
        //Działa do tego momentu: A->B->C
    }

    void printTwoArrays(ArrayList data1, ArrayList data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice posiadaj inna ilosc elemntow");

        for(int i=0;i<data1.size();i++){
            System.out.println(data1.get(i)+" : "+data2.get(i));
        }
    }

    void printTwoArraysSum(ArrayList<Integer> data1, ArrayList<Integer> data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice posiadaja inna ilosc elemntow");

        for(int i=0;i<data1.size();i++){
            double sum = (double)data1.get(i)+(double)data2.get(i);
            System.out.println(data1.get(i)+" + "+data2.get(i)+" = "+sum);
        }
    }

    <T,U> void printTwoArraysSum1(ArrayList<T> data1, ArrayList<U> data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice posiadaja inna ilosc elemntow");

        for(int i=0;i<data1.size();i++){
            double sum = (double)data1.get(i)+(double)data2.get(i);
            System.out.println(data1.get(i)+" + "+data2.get(i)+" = "+sum);
        }
    }

    void printTwoArraysSumExtends(ArrayList<? extends Number> data1, ArrayList<? extends Number> data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice posiadaja inna ilosc elemntow");

        for(int i=0;i<data1.size();i++){
            try {
                double sum = Double.parseDouble(data1.get(i).toString()) + Double.parseDouble(data2.get(i).toString());
                System.out.println(data1.get(i) + " + " + data2.get(i) + " = " + sum);
            }catch(Exception e){
                throw new Exception("Wystapil blad przy konwertowaniu elementu nr: "+i);
            }
        }
    }




}
