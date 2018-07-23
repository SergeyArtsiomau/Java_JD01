package ControlWork.task4.SAX;

import ControlWork.task4.FactoryMethod;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class ShemeService extends FactoryMethod {

    public ShemeService() {
    }

    private static class Holder {
        private static final ShemeService instance = new ShemeService();
    }

    public static ShemeService getInstance() {
        return Holder.instance;
    }

    @Override
    public String parse() {
        try {
            File inputFile = new File("sheme.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}


