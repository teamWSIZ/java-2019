package com.javafx.example.figures;

import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class FigureTriangle extends Figure {
    //TODO
    //proszę uzupełnić odpowiednią klasę
    Polygon polygon;

    FigureTriangle(Group group) {
        super(group);
    }

    @Override
    void initFigure() {

    }

    @Override
    void showFigure() {

    }

    @Override
    public Shape getShape() {
        return polygon;
    }
}
