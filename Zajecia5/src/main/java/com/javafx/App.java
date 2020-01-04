/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.javafx;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    Rectangle rects[] = new Rectangle[10];

    void addElements(){
        for(int i=0;i<10;i++) {
            Rectangle rect = new Rectangle();
            rect.setWidth(20);
            rect.setHeight(20);
            
            rect.setTranslateX(i*40);
            rect.setTranslateY(250);

            rect.setFill(Color.BLUE);

            rects[i] = rect;
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group,500,500);

        addElements();

        for(int i=0;i<rects.length;i++){
            group.getChildren().add(rects[i]);
        }

        double liczby[] = new double[10];


        System.out.print("[");

        for(int i=0;i<liczby.length;i++) {

            if(i<liczby.length-1) {
                System.out.print(liczby[i] + ", ");
            }else {
                System.out.print(liczby[i]);
            }

        }

        System.out.println("]");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}