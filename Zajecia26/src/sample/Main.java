package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group,500,512);

        primaryStage.setTitle("Zajecia26");

        primaryStage.setScene(scene);
        primaryStage.show();

        Rectangle rect = new Rectangle(100,100);
        rect.setFill(Color.CADETBLUE);
        rect.setX(200);
        rect.setY(200);

        RotateTransition rt = new RotateTransition();
        rt.setDuration(Duration.seconds(2));

        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setNode(rect);

        rt.setAutoReverse(true);
        rt.setCycleCount(10);

        rt.play();

        group.getChildren().add(rect);
    }
}