package scau.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:33
 * Description: No Description
 */
public class PCServer {
    private static Logger log = Logger.getLogger("PCServer class:");

    private static ServerSocket serverSocket = null;

    {
        try {
            serverSocket = new ServerSocket(7788);
            log.info(serverSocket.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
