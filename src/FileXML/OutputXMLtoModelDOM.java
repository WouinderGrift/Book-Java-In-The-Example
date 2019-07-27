package FileXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import java.io.File;
import java.io.IOException;

/**
 * Вывод содержимого XML по модели DOM
 */

class OutputXMLtoModelDOM {
    //Вывод отступа для разделения уровне: 3 пробела * номер уровня
    private static void printIndentation(int level){
        for(int  i = 0; i < level; i++){
            System.out.print("   ");
        }
    }

    //Печать содержимого
    private static void print (Node node, int level){
        //для каждого следующего уровня выводится пустая строка и отступ
        if(level > 0){
            System.out.println("");
            printIndentation(level);
        }
        //вывод имени узла
        System.out.println(node.getNodeName().toString() + ":");

        //вывод атрибутов узла
        if(node.hasAttributes()){
            NamedNodeMap attributesMap = node.getAttributes();
            if(attributesMap.getLength() > 0){
                level++;

                for(int i = 0; i < attributesMap.getLength(); i++){
                    Node atribute = (Node) attributesMap.item(i);
                    //вывод после отступа имени и значения атрибута

                    printIndentation(level);
                    String s = "." + atribute.getNodeName() + "=";
                    System.out.println(s + atribute.getNodeValue());
                }
                level--;
            }
        }

        String value = node.getNodeValue();
        value = (value == null ? "" : value.trim());
        if(value.length() > 0){
            printIndentation(level);
            System.out.println(value);
        }

        //печать дочерних узолов, если они есть
        if(node.hasChildNodes()){
            //дочерние узлы - следующий уровень
            level++;
            NodeList children = node.getChildNodes();

            for(int i = 0; i < children.getLength(); i++){
                Node child = (Node) children.item(i);
                print(child, level);
            }
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        if(args.length < 1) {
            System.out.println("Usage: java DomPrint <имя_файла>");
            System.exit(0);
        }

        File docFile = new File(args[0]);
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);

            DocumentBuilder builder = factory.newDocumentBuilder();

            //разбор входного файла
            Document doc = builder.parse(docFile);
            print((Node) doc.getDocumentElement(), 0);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

