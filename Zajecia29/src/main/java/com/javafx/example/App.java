/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.javafx.example;

import com.javafx.example.figures.FigureRectangle;
import com.javafx.example.figures.FigureTriangle;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 512, 512);

        primaryStage.setScene(scene);
        primaryStage.show();

        //TODO
        //ćwiczenie 1: proszę zastąpić kod klasą AnimatedFigure
        for(int i = 0; i<10;i++) {
            FigureRectangle fr = new FigureRectangle(group, new Rectangle());
            FigureTriangle ft = new FigureTriangle(group);
            RotateTransition rt = rotation();
            rt.setNode(fr.getShape());
            rt.play();
        }

        //ćwiczenie 2: proszę uzupełnić kod o animowane trójkąty
        //ćwiczenie 3: proszę dodać klawisz pozwalający na uruchomienie wszystkich animacji

        //ćwiczenie 4: proszę dodać kilka dodatkowych animacji

    }

    RotateTransition rotation(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.setDuration(Duration.seconds(1+Math.random()*19));
        rotateTransition.setAutoReverse(true);
        rotateTransition.setCycleCount(10);

        return rotateTransition;
    }
}
