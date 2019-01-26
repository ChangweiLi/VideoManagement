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

    public static final Logger LOG = Logger.getLogger(InitVideoData.class.getName());
    /* 存放的视频文件*/
    private Files videoFiles;
    /* 存放的视频路径根目录 */
    private static Path directoryPath;
    /* 单个视频文件的路径*/
    private static Path oneVideoFilePath;


    public InitVideoData() {
        init();
    }

    public void init() {
    }
}
