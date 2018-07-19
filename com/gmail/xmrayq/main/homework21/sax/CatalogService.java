package com.gmail.xmrayq.main.homework21.sax;

import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class CatalogService {
    public void catalogSAXParser() {
        try {
            File inputFile = new File("catalog.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

