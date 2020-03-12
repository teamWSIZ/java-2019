package com.javafx.example;

import javafx.scene.Group;

abstract public class Figure {
    Group group;

    Figure(Group group){
        this.group = group;
    }

    abstract void initFigure();
    abstract void showFigure();
}
