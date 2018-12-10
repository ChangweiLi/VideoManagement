package scau.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import scau.service.PCSocketServer;


/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:23
 * Description: this is Controller level, start ServerSocket Service.
 */
public class ConnectController {

    @FXML
    private TextField nameTextField;

    @FXML
    public void clickStartService(ActionEvent event) {

        PCSocketServer pcSocketServer = PCSocketServer.getInstance();
        System.out.println("pcSocket String is " + pcSocketServer.toString());

//        此处的端口由用户自己设置代码自动获取
//        监听接收服务
//        pcSocketServer.startServer("gagag/jps");
//        System.out.println("this is ConnectController"+pcSocketServer);
    }
}
