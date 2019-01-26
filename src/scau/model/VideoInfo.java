package scau.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2018/4/11
 * Time: 18:16
 * Description: No Description
 */
public class VideoInfo {
    /* 视频的名称 */
    private StringProperty name;
    /* 视频的上传作者*/
    private StringProperty author;
    /* 视频的创建时间 */
    private StringProperty createTime;
    /* 视频的上传时间 */
    private StringProperty uploadTime;
    /* 视频的路径 */
    private StringProperty path;
    /* 视频的大小 */
    private StringProperty size;
    /* 视频文件的格式 */
    private StringProperty type;

    public VideoInfo(StringProperty name, StringProperty author, StringProperty createTime, StringProperty uploadTime, StringProperty path, StringProperty size, StringProperty type) {
        this.name = name;
        this.author = author;
        this.createTime = createTime;
        this.uploadTime = uploadTime;
        this.path = path;
        this.size = size;
        this.type = type;
    }

    public VideoInfo(String name, String author, String createTime, String upLoadTime, String path, String size, String type) {
//       VideoInfo(new StringProperty(name),)
        setName(name);
        setAuthor(author);
        setCreateTime(createTime);
        setUploadTime(upLoadTime);
        setPath(path);
        setSize(size);
        setType(type);
    }


    private void setName(String value) {
        nameProperty().set(value);
    }

    public String getName() {
        return nameProperty().get();
    }

    private StringProperty nameProperty() {
        if (name == null) name = new SimpleStringProperty(this, "name");
        return name;
    }


    private void setAuthor(String value) {
        authorProperty().set(value);
    }

    public String getAuthor() {
        return authorProperty().get();
    }

    private StringProperty authorProperty() {
        if (author == null) author = new SimpleStringProperty(this, "author");
        return author;
    }

    public String getCreateTime() {
        return createTimeProperty().get();
    }

    private StringProperty createTimeProperty() {
        if (createTime == null) createTime = new SimpleStringProperty(this, "createTime");
        return createTime;
    }

    private void setCreateTime(String createTime) {
        createTimeProperty().set(createTime);
    }

    public String getUploadTime() {
        return uploadTimeProperty().get();
    }

    private StringProperty uploadTimeProperty() {
        if (uploadTime == null) uploadTime = new SimpleStringProperty(this, "uploadTime");
        return uploadTime;
    }

    private void setUploadTime(String uploadTime) {
        uploadTimeProperty().set(uploadTime);
    }

    public String getPath() {
        return pathProperty().get();
    }

    private StringProperty pathProperty() {
        if (path == null) path = new SimpleStringProperty(this, "path");
        return path;
    }

    private void setPath(String path) {
        pathProperty().set(path);
    }

    public String getSize() {
        return sizeProperty().get();
    }

    private StringProperty sizeProperty() {
        if (size == null) size = new SimpleStringProperty(this, "size");
        return size;
    }

    private void setSize(String size) {
        sizeProperty().set(size);
    }

    public String getType() {
        return type.get();
    }

    private StringProperty typeProperty() {
        if (type == null) type = new SimpleStringProperty(this, "type");
        return type;
    }

    private void setType(String type) {
        typeProperty().set(type);
    }


}
