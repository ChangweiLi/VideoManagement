package scau.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import scau.service.PCSocketServer;
import scau.utils.InitVideoData;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:52
 * Description: No Description
 */
public class WindowMainController implements Initializable{

    @FXML
    private MenuBar menuBar;

    private Path path;

    private InitVideoData initVideoData;

    public WindowMainController() {
//        path = Paths.get("D:/data","tt.txt");
        new InitVideoData();
    }

    @FXML
    public void clickOpen(ActionEvent event) {
        System.out.println("你点击了open");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       menuBar.setFocusTraversable(true);
    }

    @FXML
    public void handleKeyInput(KeyEvent keyEvent) {
        System.out.println("键盘输入！");
    }

    @FXML
    public void clickSaveAs(ActionEvent event) {
        System.out.println("saveas");
    }

    @FXML
    public void clickSave(ActionEvent event) {
        System.out.println("save");
    }


    @FXML
    public void clickConnect(ActionEvent event) {
//        自动获取IP地址刷新UI界面
        loadFxmlShowStage("dialog_connection.fxml");
//        ConnectController d = new ConnectController();

    }


    @FXML
    public void clickSetting(ActionEvent event) {
        System.out.println("setting");
    }

    @FXML
    public void clickExit(ActionEvent event) {
        System.exit(0);
        System.out.println("Exit");
    }

    @FXML
    public void clickAbout(ActionEvent event){
        loadFxmlShowStage("dialog_aboutMe.fxml");
    }

    @FXML
    public void clickCurrentTask(ActionEvent event) {
        /*  打开about 窗口 */
        loadFxmlShowStage("tableview_currentTask.fxml");
    }

    /*  打开相关窗口，显示场景 */
    public void loadFxmlShowStage(String fxmlStr){
        Stage stage1 = new Stage();
        Parent root  = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("scau/view/"+fxmlStr));
        } catch (IOException e) {
            e.printStackTrace();
    }
        stage1.setTitle("Start Service");
        stage1.setResizable(false);
        stage1.setScene(new Scene( root));
        stage1.show();
    }

    @FXML
    public void clickReceiveHistory(ActionEvent event) {

    }

    @FXML
    public void clickHelp(ActionEvent event) {
        URI uri = URI.create("http://www.baidu.com");
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickCheck(ActionEvent event) {
        URI uri = URI.create("http://lcwei.site");
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
