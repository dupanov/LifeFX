package world;/**
 * Created by ����� on 21.11.2015.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class World extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("world.fxml"));
            primaryStage.setTitle("Life");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
    }
}
