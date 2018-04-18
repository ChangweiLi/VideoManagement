package scau.utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import scau.model.VideoInfo;

import java.io.File;
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
     /* 存放的视频路径根目录 */
     private static Path directoryPath;
     /* 单个视频文件的路径*/
     private static Path oneVideoFilePath;

  /*   private  final ObservableList<VideoInfo> videoInfoObservableList = FXCollections.observableArrayList(
             new VideoInfo("video1","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video2","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video3","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video4","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video5","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video6","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video7","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
             new VideoInfo("video8","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4")
     );*/

    public InitVideoData() {
        init();
    }
    public void init(){
//        try{
//            directoryPath = Paths.get("D:/videoFileManagement/videoData");
//            Files.createDirectory(directoryPath);
//            log.info("Directory created successfully!");
//            oneVideoFilePath = Paths.get("D:/videoFileManagement/videoData/test.txt");
//            Files.createFile(oneVideoFilePath);
//            log.info("File created successfully!");
//            创建子目录
//            Path directoriesPath = Paths.get("D:/videoFileManagement/videoData/subtest");
//            Files.createDirectories(directoriesPath);
//            log.info("Sub directory created successfully!");
//            System.out.println(directoryPath.toString());
//        }
//        catch (FileAlreadyExistsException e) {
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        finally {
//            log.info("init finally");
//        }
        log.info("init");

    }
}
