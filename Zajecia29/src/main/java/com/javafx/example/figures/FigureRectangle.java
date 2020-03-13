package com.javafx.example.figures;

import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class FigureRectangle extends Figure {
    Rectangle rectangle;
    double xCenter;
    double yCenter;

    public FigureRectangle(Group group, Rectangle rectangle){
        //Ta funkcja wywołuje konstruktor klasy nadrzędnej
        super(group);

        this.rectangle = rectangle;
        xCenter = group.getScene().getWidth()/2;
        yCenter = group.getScene().getHeight()/2;

        initFigure();
        showFigure();
    }

    void initFigure(){
        double a = RandomHelper.randomDimension();

        rectangle.setWidth(a);
        rectangle.setHeight(a);
        rectangle.setFill(RandomHelper.randomColor());

        rectangle.setTranslateX(xCenter + RandomHelper.randomTranslation());
        rectangle.setTranslateY(yCenter + RandomHelper.randomTranslation());
    }

    @Override
    void showFigure() {
        //Grupa została zainicjowa w konstruktorze
        group.getChildren().add(rectangle);
    }

    @Override
    public Shape getShape() {
        return rectangle;
    }
}
