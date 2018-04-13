package scau.utils;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/13
 * Time: 10:22
 * Description: init data about system video data
 */
public class InitVideoData {

     public static final Logger log = Logger.getLogger(InitVideoData.class.getName());
     /* 存放的视频文件*/
     private Files videoFiles;
     /* 存放的视频路径 */
     private static Path videoFilesPath;
     /* 单个视频文件的路径*/
     private Path oneVideoFilePath;

    public InitVideoData(Path videoFilesPath) {
        this.videoFilesPath = videoFilesPath;
        init();
    }

    public InitVideoData(Files videoFiles, Path videoFilesPath) {
        this.videoFiles = videoFiles;
        this.videoFilesPath = videoFilesPath;
    }

    private void init(){
//        创建目录
      //  videoFilesPath = Paths.get("D：//videoFileManagement/videoData/");
        try{
            Path newDir = Files.createDirectory(videoFilesPath);
        }
        catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            log.info("init end");
        }

    }
}
