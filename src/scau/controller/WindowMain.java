package scau.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyEvent;
import scau.utils.InitVideoData;

import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:52
 * Description: No Description
 */
public class WindowMain implements Initializable{
    @FXML
    private MenuBar menuBar;
    Path path;
    InitVideoData initVideoData;
    public WindowMain() {
        path = Paths.get("D:/data//videoinfo");
        initVideoData = new InitVideoData(path);
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
        System.out.println("connect");
    }

    @FXML
    public void clickSetting(ActionEvent event) {
        System.out.println("setting");
    }

    @FXML
    public void clickExit(ActionEvent event) {
        System.out.println("Exit");
    }
}
