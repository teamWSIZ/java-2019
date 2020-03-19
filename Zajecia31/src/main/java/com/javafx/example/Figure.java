package com.javafx.example;

import javafx.scene.paint.Color;

class Figure {
    final Color color;
    final float xPositon;
    final float yPositon;

    Figure(Color color){
        //proszę zwrócić uwagę, że w konstruktorze można przypicać wartość
        //do stałej!
        this.color = color;

        xPositon = 100;
        yPositon = 100;
    }
}

