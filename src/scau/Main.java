package scau;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scau.service.PCSocketServer;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/window_main.fxml"));
        primaryStage.setTitle("Video File Management System V 1.0.0");
        primaryStage.setScene(new Scene(root, 1300,800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    //初始化ServerSocket单例，整个系统只存在一个实例
    static {
            PCSocketServer pcSocketServer = PCSocketServer.getInstance();
            System.out.println("static 初始化之后 "+pcSocketServer.toString());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
