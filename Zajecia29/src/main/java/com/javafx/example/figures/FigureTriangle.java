package com.javafx.example.figures;

import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class FigureTriangle extends Figure{
    //TODO
    //proszę uzupełnić odpowiednią klasę
    Polygon polygon;

    double xCenter;
    double yCenter;

    public FigureTriangle(Group group) {
        super(group);

        polygon = new Polygon();

        xCenter = group.getScene().getWidth()/2;
        yCenter = group.getScene().getHeight()/2;

        initFigure();
        showFigure();
    }

    @Override
    void initFigure() {
        double a = RandomHelper.randomDimension();
        double h = Math.sqrt(3.0)/2.0*a;

        Double[] points = new Double[]{
                0.0,0.0,
                a,0.0,
                a/2.0,h
        };

        polygon.setFill(RandomHelper.randomColor());
        polygon.getPoints().addAll(points);

        polygon.setTranslateX(xCenter + RandomHelper.randomTranslation());
        polygon.setTranslateY(yCenter + RandomHelper.randomTranslation());
    }

    @Override
    void showFigure() {
        group.getChildren().add(polygon);
    }

    @Override
    public Shape getShape() {
        return polygon;
    }
}
