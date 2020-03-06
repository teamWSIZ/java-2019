package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group,512,512);

        primaryStage.setTitle("Zajecia26");

        primaryStage.setScene(scene);
        primaryStage.show();

        Rectangle rect = new Rectangle(100,100);
        rect.setFill(Color.CADETBLUE);

        group.getChildren().add(rect);
    }
}