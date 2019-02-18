package scau.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;



import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Logger;


/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:23
 * Description: this is Controller level, start ServerSocket Service.
 */
public class ConnectController implements Initializable{
    private static final Logger LOG = Logger.getLogger(ConnectController.class.getName());

    @FXML
    private TextField ipTextField ;

    @FXML
    private TextField portTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            ipTextField.setText(InetAddress.getLocalHost().getHostAddress());
//            portTextField.setText("8899");
//            LOG.info("默认ip为：" +InetAddress.getLocalHost().getHostAddress()+" port为：" + portTextField.getText());
        } catch (UnknownHostException e) {
            LOG.info("获取ip地址失败");
            e.printStackTrace();
        }
    }


    @FXML
    public void clickStartService(ActionEvent event) {
        try {
            int port = Integer.parseInt(portTextField.getText().trim());
        }
        catch(Exception e){
            LOG.warning("端口转换数字失败");
            e.printStackTrace();
        }

    }

    @FXML
    public  String getAddress(){
        return ipTextField.getText();
    }

    @FXML
    public  int getPort(){
        int port = 8899;
        try {
//            System.out.println("port = " + portTextField.getText().trim());
//            int port = Integer.parseInt(portTextField.getText());
            return port;
        }
        catch(Exception e){
            LOG.warning("端口转换数字失败");
            e.printStackTrace();
            return 0;
        }
//        return port;
    }


}
