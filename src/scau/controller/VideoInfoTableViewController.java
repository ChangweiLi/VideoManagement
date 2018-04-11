package scau.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import scau.model.VideoInfo;

public class VideoInfoTableViewController {
    @FXML
    private TableView<VideoInfo> videoInfoTableView;
    @FXML
    private TableColumn<VideoInfo,String>  tc_name;
    @FXML
    private TableColumn<VideoInfo,String>  tc_author;
    @FXML
    private TableColumn<VideoInfo,String>  tc_createTime;
    @FXML
    private TableColumn<VideoInfo,String>  tc_uploadTime;
    @FXML
    private TableColumn<VideoInfo,String>  tc_path;
    @FXML
    private TableColumn<VideoInfo,String>  tc_size;
    @FXML
    private TableColumn<VideoInfo,String>  tc_type;


}
