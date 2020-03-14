package com.javafx.example.figures;

import javafx.scene.Group;
import javafx.scene.shape.Shape;

abstract public class Figure {
    Group group;

    public Figure(Group group){
        this.group = group;
    }

    abstract void initFigure();
    abstract void showFigure();

    public abstract Shape getShape();
}
