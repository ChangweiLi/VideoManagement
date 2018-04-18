package scau.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import scau.model.VideoInfo;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoInfoTableViewController implements Initializable{
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

  /*  private  final ObservableList<VideoInfo> videoInfoObservableList = FXCollections.observableArrayList(
            new VideoInfo("video1","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video2","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video3","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video4","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video5","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video6","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video7","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4"),
            new VideoInfo("video8","lichangwei","2018-01-01","2018-01-02","D:/video","200","mp4")
    );*/
//    ObservableList<TableColumn> observableList = getT;
    public VideoInfoTableViewController() {
//        loadData(videoInfoObservableList);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loadData(ObservableList<VideoInfo> list){
        tc_name.setCellValueFactory(new PropertyValueFactory("name"));
        tc_author.setCellValueFactory(new PropertyValueFactory("author"));
        tc_createTime.setCellValueFactory(new PropertyValueFactory("createTime"));
        tc_uploadTime.setCellValueFactory(new PropertyValueFactory("uploadTime"));
        tc_path.setCellValueFactory(new PropertyValueFactory("path"));
        tc_size.setCellValueFactory(new PropertyValueFactory("size"));
        tc_type.setCellValueFactory(new PropertyValueFactory("type"));
        videoInfoTableView.setItems(list);
    }
}
