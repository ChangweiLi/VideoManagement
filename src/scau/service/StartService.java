package scau.service;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import scau.controller.ConnectController;


import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:34
 * Description:
 */
public class StartService extends Service {
    private final static Logger LOG = Logger.getLogger(FileServer.class.getName());

    @Override
    protected Task createTask() {
        return new Task() {
            @Override
            protected Object call() {
                try {
                    LOG.info(" 开启文件服务中...");
                    ConnectController connectController = new ConnectController();
                    int port = connectController.getPort();
                    if (port > 0) {
                        FileServer server = new FileServer(port);
                        LOG.info("接收文件服务已开启,可以接收文件...");
                        server.load();
                    } else {
                        LOG.info("端口必须大于0并且小于65535，并且不占用当前已使用的端口建议端口大于10000");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

    }


}
