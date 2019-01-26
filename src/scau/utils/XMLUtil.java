package scau.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
 * Description: No Description
 */
public class XMLUtil {
    private static final Logger LOG = Logger.getLogger(XMLUtil.class.getName());

    private static void  createXml(String filePath){
        // TODO 创建新XML文件
    }

    private static void  updateXml(String filepath){
            // TODO 修改XML文件，或者是只增加某个结点
    }

    private static void readXml(String filePath) throws ParserConfigurationException {
        File file = new File(filePath);
        if(file.exists()){
            // 如果文件存在则解析XML文件生成对象显示在
            Document document = getDocument(file);
            if (document != null){
                parseXml(document);
            }
            else{
                LOG.info("对不起,返回document对象失败");
            }

        }
        else{
            LOG.info("对不起XML文件不存在");
        }
    }

//    private List<Node> getBookList(Document document,String nodeName){
//        return (List<Node>) document.getElementsByTagName(nodeName);
//    }
    private static void parseXml(Document document){
        NodeList rootList = document.getElementsByTagName("root");
        LOG.info("解析XML文件 root length == "+ String.valueOf(rootList.getLength()));
//        for(int i = 0; i < rootList.getLength(); i++){
//            Node node = rootList.item(i);
//
//        }
        // TODO 遍历 结点对象
    }

    private static  Document getDocument(File file) throws ParserConfigurationException {
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
        }
        finally {
            LOG.info("对不起XML文件不存在");
        }
        return null;
    }
}
