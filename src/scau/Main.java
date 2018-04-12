package scau;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/window_main.fxml"));
        primaryStage.setTitle("Video File Management System V 1.0.0");
        primaryStage.setScene(new Scene(root, 1300,800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
