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
    private  StringProperty name;
    /* 视频的上传作者*/
    private  StringProperty author;
    /* 视频的创建时间 */
    private  StringProperty createTime;
    /* 视频的上传时间 */
    private  StringProperty uploadTime;
    /* 视频的路径 */
    private  StringProperty path;
    /* 视频的大小 */
    private  StringProperty size;
    /* 视频文件的格式 */
    private  StringProperty type;

    public VideoInfo(StringProperty name, StringProperty author, StringProperty createTime, StringProperty uploadTime, StringProperty path, StringProperty size, StringProperty type) {
        this.name = name;
        this.author = author;
        this.createTime = createTime;
        this.uploadTime = uploadTime;
        this.path = path;
        this.size = size;
        this.type = type;
    }
  /*  name */
    public void setName(String value){
        nameProperty().setValue(value);
    }
    public String getName(){
        return nameProperty().get();
    }
    public StringProperty nameProperty() {
        if(name == null) name = new SimpleStringProperty(this,"name");
        return name;
    }

/*   author */
     public void setAuthor(String value){
          authorProperty().setValue(value);
      }
    public String getAuthor(){
        return authorProperty().get();
    }
    public StringProperty authorProperty() {
        if(author == null) author = new SimpleStringProperty(this,"author");
        return author;
    }

/*    createTime */

/*   uploadTime*/


/*   path */

/*   size  */

/*   type  */


}
