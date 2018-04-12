package scau.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyEvent;

import java.net.URL;
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
    }

    @FXML
    public void clickConnect(ActionEvent event) {
    }

    @FXML
    public void clickSetting(ActionEvent event) {
    }

    @FXML
    public void clickExit(ActionEvent event) {
    }
}
