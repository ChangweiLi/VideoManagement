package scau.service;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:34
 * Description:
 */
public class StartService extends Service{
    private final static Logger LOG = Logger.getLogger(FileServer.class.getName());

    @Override
    protected Task createTask() {
       return new Task() {
           @Override
           protected Object call() throws Exception {
               try {
                   LOG.info(" 开启文件服务中...");
                   FileServer server = new FileServer();
                   LOG.info("接收文件服务已开启,可以接收文件...");
                   server.load();
               } catch (IOException e) {
                   e.printStackTrace();
               }
               return null;
           }
       };

    }
}
