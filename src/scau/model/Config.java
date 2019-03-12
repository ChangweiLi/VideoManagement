package scau.model;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/3/11
 * Time: 15:37
 * Description: 存储软件系统的设置信息
 * 设置参数包括：ip地址和端口设置、视频存储目录、配置文件存储目录、语言、其它
 */
public class Config {
    private String IP;
    private String PORT;
    private String videoPath;
    private String configPath;
    private String language;
    private String other;

    public Config(String IP, String PORT, String videoPath, String configPath, String language) {
        this.IP = IP;
        this.PORT = PORT;
        this.videoPath = videoPath;
        this.configPath = configPath;
        this.language = language;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getConfigPath() {
        return configPath;
    }

    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
