package com.javafx.example;

import com.javafx.example.figures.Figure;
import javafx.animation.RotateTransition;

public class AnimatedFigure<T extends Figure> {
    T figure;
    RotateTransition animation;
    AnimatedFigure(T figure, RotateTransition animation){
        this.figure = figure;
        this.animation = animation;

        animation.setNode(this.figure.getShape());
    }

    public void play(){
        animation.play();
    }

    public void stop(){
        animation.stop();
    }
}
