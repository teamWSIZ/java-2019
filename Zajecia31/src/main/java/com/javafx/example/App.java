/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.javafx.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 512, 512);

        Button generate = createButton("Generate");
        Button clear = createButton("Clear");
        Button arrayList = createButton("All");
        Button set = createButton("Set");

        generate.setOnMouseClicked(e->{
            generate();
        });

        HBox hBox = new HBox();
        hBox.getChildren().addAll(generate,clear,arrayList,set);

        //hBox.setPrefSize(scene.getWidth(),scene.getHeight());
        //hBox.setAlignment(Pos.BOTTOM_CENTER);
        //hBox.setSpacing(5);

        group.getChildren().add(hBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    void generate(){

    }

    Button createButton(String text){
        //W tej funkcji można ustawić parametry wszystkich klawiszy
        Button button = new Button(text);
        //button.setMaxWidth(Double.MAX_VALUE);
        //HBox.setHgrow(button, Priority.ALWAYS);
        return button;
    }


}
