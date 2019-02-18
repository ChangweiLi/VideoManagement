package scau.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//import scau.utils.InitVideoData;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:52
 * Description: No Description
 */
public class WindowMainController implements Initializable {

    @FXML
    private MenuBar menuBar;

    private Stage stage;

    private  Tooltip tooltip = new Tooltip();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menuBar.setFocusTraversable(true);
        tooltip.setText("you can click menubar ");
        menuBar.setTooltip(tooltip);
    }

    @FXML
    public void handleKeyInput(KeyEvent keyEvent) {
        System.out.println("键盘输入！");
    }


    @FXML
    public void clickOpen(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Video Resource File");
        fileChooser.showOpenDialog(stage);
        System.out.println("你点击了open");
    }

    @FXML
    public void clickSaveAs(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("SaveAs Video Resource File");
        fileChooser.showSaveDialog(stage);
        System.out.println("saveas");
    }

    @FXML
    public void clickSave(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Video Resource File");
        fileChooser.showSaveDialog(stage);
        System.out.println("save");
    }


    @FXML
    public void clickConnect(ActionEvent event) {
//        自动获取IP地址刷新UI界面
        loadFxmlShowStage("dialog_connection.fxml");
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
    public void clickAbout(ActionEvent event) {
        loadFxmlShowStage("dialog_aboutMe.fxml");
    }

    @FXML
    public void clickCurrentTask(ActionEvent event) {
        /*  打开about 窗口 */
        loadFxmlShowStage("tableview_currentTask.fxml");
    }


    @FXML
    public void clickReceiveHistory(ActionEvent event) {
        //TODO 加载历史记录，接收的时候保存全部记录到XML文件里面去，然后在根据这个全部文件与现有的视频文件对比，查看哪些是已经删除了的，此方法只需加载
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

    /*  打开相关窗口，显示场景 */
    public void loadFxmlShowStage(String fxmlStr) {
        Stage stage1 = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("scau/view/" + fxmlStr));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage1.setTitle("Start Service");
        stage1.setResizable(false);
        stage1.setScene(new Scene(root));
        stage1.show();
    }
}
