package com.example.objects;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Main {
    static ArrayList<Double> mTablica = new ArrayList<>();

    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            mTablica.add((double)i);

        wyswietlTablice(mTablica);
    }

    public static void wyswietlTablice(@NotNull ArrayList<Double> t){

        System.out.print("[");

        for(int i=0;i<t.size();i++){
            if(i<t.size()-1)
                System.out.print(""+i+", ");
            else
                System.out.print(""+i);
        }

        System.out.println("]");
    }
}
