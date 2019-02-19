package scau;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scau.service.FileServer;
import scau.service.PCSocketServer;
import scau.service.StartService;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/window_main.fxml"));
        primaryStage.setTitle("Video File Management System V 1.0.0");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
        StartService h = new StartService();
        h.start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
