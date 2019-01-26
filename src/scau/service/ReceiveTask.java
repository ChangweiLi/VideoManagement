package scau.service;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/1/8
 * Time: 15:45
 * Description: No Description
 */

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * 定义接收线程 处理客户端传输过来的文件
 */
public class ReceiveTask implements Runnable {
    private final static Logger LOG = Logger.getLogger(ReceiveTask.class.getName());

    private Socket socket;
    private DataInputStream dataInputStream;
    private FileOutputStream fileOutputStream;

    public ReceiveTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            dataInputStream = new DataInputStream(socket.getInputStream());

            // 文件名和长度
            String fileName = dataInputStream.readUTF();
            long fileLength = dataInputStream.readLong();
            File directory = new File("E:\\SocketFile");
            if (!directory.exists()) {
                directory.mkdir();
            }
            File file = new File(directory.getAbsolutePath() + File.separatorChar + fileName);
            fileOutputStream = new FileOutputStream(file);

            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = dataInputStream.read(bytes, 0, bytes.length)) != -1) {
                fileOutputStream.write(bytes, 0, length);
                fileOutputStream.flush();
            }
            LOG.info("=======文件名：" + fileName + "  文件大小：" + fileLength + "，接收成功======");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                socket.close();
            } catch (IOException e) {
                LOG.warning("发生错误:"+e.getMessage());
                e.printStackTrace();
            }
        }
    }


}