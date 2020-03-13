package com.javafx.example;

import javafx.scene.paint.Color;

//Prosta klasa generująca kilka potrzebnych zmiennych

public class RandomHelper {
    public static double randomTranslation() {

        return (Math.random() * 400 - 200);
    }

    public static double randomDimension() {
        //Funkcja generuje liczbę z przedziału [10,50]
        return Math.random() * 40 + 10;
    }

    public static Color randomColor() {
        //Funkcja color przyjmuje agrumenty z zakresu [0,1]
        return Color.color(Math.random(), Math.random(), Math.random());
    }
}
