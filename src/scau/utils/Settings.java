package scau.utils;

import java.io.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/3/11
 * Time: 13:53
 * Description: No Description
 */
public class Settings {
    private Properties pro;
    private static final String  filePath = "";

    public Settings(Properties pro) {
        this();
        this.pro = pro;
    }

    public Settings(){
       pro = new Properties();
    }

    /**
     *
     * @return
     */
    public  static Properties getProperties(){
       Properties prop = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    /**
     * 修改配置文件
     * @param key 属性名称
     * @param value 属性值
     */
    public static void modifyConfig(String key, String value){
        Properties prop = getProperties();
        if (prop != null){
            prop.setProperty(key,value);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            prop.store(outputStream,"modify");
            outputStream.close();
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取工程路径
     * @return
     */
    public static String getProjectPath(){
        return "";
    }

//    private  void load(String file) throws IOException {
//        FileInputStream in = null;
//        try {
//            in = new FileInputStream(file);
//            this.pro.load(in);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (in != null){
//                in.close();
//            }
//        }
//    }
//
//    private void store(String file) throws IOException {
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream= new FileOutputStream(file);
//            this.pro.store(fileOutputStream, "comment");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (fileOutputStream != null){
//                fileOutputStream.close();
//            }
//        }
//    }
}
