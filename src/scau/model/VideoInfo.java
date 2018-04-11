package scau.model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 18:16
 * Description: No Description
 */
public class VideoInfo {
    /* 视频的名称 */
    private  SimpleStringProperty name;
    /* 视频的上传作者*/
    private  SimpleStringProperty author;
    /* 视频的创建时间 */
    private  SimpleStringProperty createTime;
    /* 视频的上传时间 */
    private  SimpleStringProperty uploadTime;
    /* 视频的路径 */
    private  SimpleStringProperty path;
    /* 视频的大小 */
    private  SimpleStringProperty size;
    /* 视频文件的格式 */
    private  SimpleStringProperty type;

    public VideoInfo(String name,String author,String createtime,String uploadTime,String path,String size,String type) {
        this.name = new SimpleStringProperty(name);
        this.author = new SimpleStringProperty(author);
        this.createTime = new SimpleStringProperty(createtime);
        this.uploadTime = new SimpleStringProperty(uploadTime);
        this.path = new SimpleStringProperty(path);
        this.size = new SimpleStringProperty(size);
        this.type = new SimpleStringProperty(type);
    }

    public SimpleStringProperty getName() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public SimpleStringProperty getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public SimpleStringProperty getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime.set(createTime);
    }

    public SimpleStringProperty getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime.set(uploadTime);
    }

    public SimpleStringProperty getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path.set(path);
    }

    public SimpleStringProperty getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public SimpleStringProperty getType() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }
}
