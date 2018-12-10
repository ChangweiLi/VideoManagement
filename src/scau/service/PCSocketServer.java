package scau.service;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 19:33
 * Description: No Description
 */
public class PCSocketServer {
    private static Logger log = Logger.getLogger("PCSocketServer class:");
    // PC作为服务器的端口号
    private static int port = 8899;
    private ServerSocket serverSocket;
    // 保存的文件
    private File target;
    // 将接收的文件写入电脑
    private FileOutputStream fileOutputStream;
    // 读取传送过来的数据文件
    private FileInputStream fileInputStream;
    // 套接字
    private Socket socket;
    int number;

    // 静态工厂方法
    private static PCSocketServer pcSocketServer;
    static {
        try {
            log.info("this is static try");
            pcSocketServer = new PCSocketServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PCSocketServer() throws IOException {
        number = (int) (Math.random()*1000);
        log.info("this is constroller");
        this.serverSocket = new ServerSocket(port);
    }


    public static PCSocketServer getInstance() {
        return pcSocketServer;
    }

    public void startServer(String filaname) throws IOException {
        // 在端口上创建一个服务器套接字
        this.socket = serverSocket.accept();
        try {
            target = new File(filaname);
            fileOutputStream = new FileOutputStream(target);
            //等待客户端的呼叫
            System.out.println("等待客户端的请求");
            // 阻塞
            fileInputStream = (FileInputStream) socket.getInputStream();

            // 接收数据
            byte[] b = new byte[64];
            int n = fileInputStream.read(b);
            int start = (int) System.currentTimeMillis();
            while (n != -1) {
                // 写入1024字节
                fileOutputStream.write(b, 0, n);
                // 又读1024字节大小的数据
                n = fileInputStream.read(b);
            }
            int end = (int) System.currentTimeMillis();
            System.out.println("接收花费的时间：" + (end - start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() throws IOException {
        socket.close();
        serverSocket.close();
        fileInputStream.close();
        fileOutputStream.close();
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
