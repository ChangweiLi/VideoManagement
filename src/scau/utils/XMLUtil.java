package scau.utils;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import scau.model.VideoInfo;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA
 * User: lcwei1
 * Date: 2019/1/18
 * Time: 9:22
 * Description: XMl 操作工具类，用于解析和创建XML文件
 */
public class XMLUtil {
    private static final Logger LOG = Logger.getLogger(XMLUtil.class.getName());

    private static void createXml(String filePath) {
        // TODO 创建新XML文件
    }

    private static void updateXml(String filepath) {
        // TODO 修改XML文件，或者是只增加某个结点
    }

    /**
     * 根据文件路径读取解析XML文件用于加载tableview表格
     *
     * @param filePath
     * @throws ParserConfigurationException
     */
    private static void readXml(String filePath) throws ParserConfigurationException {
        File file = new File(filePath);
        VideoInfo videoInfo = null;
        if (file.exists()) {
            // 如果文件存在则解析XML文件生成对象显示在
            Document document = getDocument(file);
            if (document != null) {
                videoInfo = parseXml(document);
            } else {
                LOG.info("对不起,返回document对象失败");
            }
        } else {
            LOG.info("对不起XML文件不存在");
        }
    }


    private static VideoInfo parseXml(Document document) {
        VideoInfo videoInfo = null;
        String name = null;
        String author = null;
        String path = null;
        String size = null;
        String timeLength = null;
        String createTime = null;
        String uploadTime = null;
        NodeList rootList = document.getElementsByTagName("root");
        LOG.info("解析XML文件 root length == " + String.valueOf(rootList.getLength()));
        // TODO 遍历 结点对象
        for (int i = 0; i < rootList.getLength(); i++) {
            //通过 item(i)方法 获取一个book节点，nodelist的索引值从0开始
            Node book = rootList.item(i);
            //获取book节点的所有属性集合
            NamedNodeMap attrs = book.getAttributes();
            //解析book节点的子节点
            NodeList childNodes = book.getChildNodes();
            //遍历childNodes获取每个节点的节点名和节点值
            for (int k = 0; k < childNodes.getLength(); k++) {
                //解析出孙子结点
                NodeList sonNodes = childNodes.item(k).getChildNodes();
                for (int s = 0; s < sonNodes.getLength(); s++) {
                    //区分出text类型的node以及element类型的node
                    System.out.println(s);
                    if (sonNodes.item(s).getNodeType() == Node.ELEMENT_NODE) {
                        //获取了element类型节点的节点名
                        System.out.print("第" + (s) + "个节点的节点名："
                                + sonNodes.item(s).getNodeName());
                        //获取了element类型节点的节点值
                        System.out.println("--节点值是：" + sonNodes.item(s).getFirstChild().getNodeValue());
                        if ("name" == sonNodes.item(s).getNodeName()) {
                            name = sonNodes.item(s).getFirstChild().getNodeValue();
                        } else if ("author" == sonNodes.item(s).getNodeName()) {
                            author = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                        else if ("path" == sonNodes.item(s).getNodeName()) {
                            path = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                        else if ("size" == sonNodes.item(s).getNodeName()) {
                            size = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                        else if ("time-length" == sonNodes.item(s).getNodeName()) {
                            timeLength = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                        else if ("create-time" == sonNodes.item(s).getNodeName()) {
                            createTime = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                        else if ("upload-time" == sonNodes.item(s).getNodeName()) {
                            uploadTime = sonNodes.item(s).getFirstChild().getNodeValue();
                        }
                    }
                }
                // 根据解析的xml文件来，创建videoInfo对象
                videoInfo = new VideoInfo(name,author,path,size,timeLength,createTime,uploadTime);
            }
        }
        return videoInfo;
    }

    private static Document getDocument(File file) throws ParserConfigurationException {
        //得到创建dom解析器的工场
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //得到DOM解析器对象
        DocumentBuilder builder = factory.newDocumentBuilder();
        try {
            Document document = builder.parse(file);
//            Element e = document.getDocumentElement();
            return document;
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            LOG.info("对不起XML文件不存在");
        }
        return null;
    }
}
