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
import java.util.logging.Logger;

public class VideoInfoTableViewController implements Initializable {
    private final static Logger LOG = Logger.getLogger(VideoInfoTableViewController.class.getName());

    @FXML
    private TableView<VideoInfo> videoInfoTableView = new TableView<>();
    @FXML
    private TableColumn<VideoInfo, String> tc_name = new TableColumn<>("name");
    @FXML
    private TableColumn<VideoInfo, String> tc_author = new TableColumn<>("author");
    @FXML
    private TableColumn<VideoInfo, String> tc_createTime = new TableColumn<>("createTime");
    @FXML
    private TableColumn<VideoInfo, String> tc_uploadTime = new TableColumn<>("upLoadTime");
    @FXML
    private TableColumn<VideoInfo, String> tc_path = new TableColumn<>("path");
    @FXML
    private TableColumn<VideoInfo, String> tc_size = new TableColumn<>("size");
    @FXML
    private TableColumn<VideoInfo, String> tc_type = new TableColumn<>("type");


    private  ObservableList<VideoInfo> videoInfoObservableList = FXCollections.observableArrayList(
            new VideoInfo("video1", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video2", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video3", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video4", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video5", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video6", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video7", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4"),
            new VideoInfo("video8", "lichangwei", "2018-01-01", "2018-01-02", "D:/video", "200", "mp4")
            // TODO 从xml里解析信息，加载视频信息
    );

    private void loadData() {
        tc_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        tc_author.setCellValueFactory(new PropertyValueFactory<>("author"));
        tc_createTime.setCellValueFactory(new PropertyValueFactory<>("createTime"));
        tc_uploadTime.setCellValueFactory(new PropertyValueFactory<>("uploadTime"));
        tc_path.setCellValueFactory(new PropertyValueFactory<>("path"));
        tc_size.setCellValueFactory(new PropertyValueFactory<>("size"));
        tc_type.setCellValueFactory(new PropertyValueFactory<>("type"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        videoInfoTableView.setItems(videoInfoObservableList);
        loadData();
        LOG.info("表格初始化完成");
    }
}
