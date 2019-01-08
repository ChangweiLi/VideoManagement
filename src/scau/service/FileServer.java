package scau.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/1/8
 * Time: 10:40
 * Description: No Description
 */
public class FileServer extends ServerSocket {
    private final static Logger LOG = Logger.getLogger(FileServer.class.getName());
//    private static final int SERVER_PORT = 8899;

    public FileServer(int port) throws IOException {
        super(port);
    }

    /**
     *  一直开启接收服务
     */
    public void load() {
        while (true) {
            try {
                Socket socket = this.accept();
                new Thread(new ReceiveTask(socket)).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

