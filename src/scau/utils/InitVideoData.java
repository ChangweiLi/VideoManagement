package scau.utils;

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

    public InitVideoData() {
        init();
    }
    public void init(){
        try{
            directoryPath = Paths.get("D:/videoFileManagement/videoData");
            Files.createDirectory(directoryPath);
            log.info("Directory created successfully!");
            oneVideoFilePath = Paths.get("D:/videoFileManagement/videoData/test.txt");
            Files.createFile(oneVideoFilePath);
            log.info("File created successfully!");
//            创建子目录
            Path directoriesPath = Paths.get("D:/videoFileManagement/videoData/subtest");
            Files.createDirectories(directoriesPath);
            log.info("Sub directory created successfully!");
            System.out.println(directoryPath.toString());
            log.info("init try");
        }
        catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            log.info("init finally");
        }

    }
}
