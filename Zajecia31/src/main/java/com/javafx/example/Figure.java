package com.javafx.example;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

class Figure {
    final Color color;
    final float xPositon;
    final float yPositon;

    final Circle circle;

    Figure(Color color){
        //proszę zwrócić uwagę, że w konstruktorze można przypicać wartość
        //do stałej!
        this.color = color;

        xPositon = (float)(Math.random()*500+50);
        yPositon = (float)(Math.random()*500+50);

        circle = new Circle();

        circle.setFill(this.color);
        circle.setRadius(Math.random()*10+10);
        circle.setCenterX(xPositon);
        circle.setCenterY(yPositon);
    }

    public void draw(Group group){
        group.getChildren().add(circle);
    }

    public Shape getShape(){
        return circle;
    }
}

