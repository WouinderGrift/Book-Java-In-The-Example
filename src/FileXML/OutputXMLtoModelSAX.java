package FileXML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Вывод ХМL по модели SAX
 */

class OutputXMLtoModelSAX extends DefaultHandler {
    public void startDocument() throws SAXException {
        System.out.println("Начало документа");
    }

    public void endDocument() {
        System.out.println();
        System.out.println("Конец документа");
    }

    public void startElement(String uri, String lName, String qName, Attributes attributes) throws SAXException {
        System.out.println();
        System.out.println(" Начало " + qName);

        //вывод атрибутов
        if (attributes.getLength() > 0) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println("   ." + attributes.getQName(i) + "=" + attributes.getValue(i));
            }
        }

    }

    public void endElement(String uri, String lName, String qName) throws SAXException {
        System.out.println(" Конец " + qName);
    }

    public void characters(char[] data, int start, int length) throws SAXException {
        StringBuffer buf = new StringBuffer(length);
        buf.append(data, start, length);
        if (buf.toString().trim().length() > 0) {
            System.out.println(" " + buf);
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        if (args.length < 1) {
            System.out.println("Usage: java SAXPrint <имя_файла>");
            System.exit(0);
        }

        try {
            File docFile = new File("y:test.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(docFile, new OutputXMLtoModelSAX());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
