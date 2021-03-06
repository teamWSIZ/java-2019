/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.javafx.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 512, 512);

        primaryStage.setScene(scene);
        primaryStage.show();

        for(int i = 0; i<100;i++) {
            new FigureRectangle(group, new Rectangle());
            new FigureTriangle(group);
        }

    }
}
