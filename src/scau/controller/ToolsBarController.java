package scau.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/12
 * Time: 9:15
 * Description: No Description
 */
public class ToolsBarController {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField authorTextField;
    @FXML
    private Button   searchButton;

    private String name;
    private String author;

    @FXML
    public void TextChanged(InputMethodEvent inputMethodEvent) {
    }

    @FXML
    public void authorInputText(InputMethodEvent inputMethodEvent) {
    }

    @FXML
    public void clickSearch(ActionEvent event) {
        System.out.println("你点击了搜索按钮");
        name = nameTextField.getText();
        author = authorTextField.getText();
        if(name == "" && author == ""){
            System.out.println("请你输入name和author");
        }
        System.out.println("文本框中输入了：name"+name +"author" +author);
    }
}
