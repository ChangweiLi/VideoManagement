package scau.controller;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.util.StringConverter;

import java.io.DataInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/12
 * Time: 9:15
 * Description: No Description
 */
public class ToolsBarController {
    private final static Logger LOG = Logger.getLogger(ToolsBarController.class.getName());

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField authorTextField;
    @FXML
    private DatePicker dp_createTime;
    @FXML
    private DatePicker dp_uploadTime;
    @FXML
    private Button searchButton;

    private SimpleStringProperty name = new SimpleStringProperty(this, "name");
    private SimpleStringProperty author = new SimpleStringProperty(this, "author");
    private SimpleObjectProperty<StringConverter<LocalDate>> createTime = new SimpleObjectProperty<>(this, "createTime");
    private SimpleStringProperty uploadTime = new SimpleStringProperty(this, "uploadTime");


    @FXML
    public void clickSearch(ActionEvent event) {
        System.out.println("你点击了搜索按钮");
        name.set(nameTextField.getText());
        author.set(authorTextField.getText());
//        createTime = dp_createTime.getEditor().toString();
//        createTime.se;
//        LOG.info("createtime  is " + createTime.);
        if (name.get() == "" && author.get() == "") {
            System.out.println("请你输入name和author");
        }
//        List<> list = new ArrayList<>();
//        list.add();
        System.out.println("文本框中输入了name: " + name.get() + "  author: " + author.get() + "create time" + createTime.get());
    }

    @FXML
    public void TextChanged(InputMethodEvent inputMethodEvent) {
    }

    @FXML
    public void authorInputText(InputMethodEvent inputMethodEvent) {
    }

}
