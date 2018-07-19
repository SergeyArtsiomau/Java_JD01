package com.gmail.xmrayq.main.homework21.dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {


    public void domParser() {
        int countOfBook = 0;
        double arithmetic_Mean = 0;
        double sum = 0;
        double price = 0;

        try {
            File inputFile = new File("catalog.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("book");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); ++temp) {
                Node nNode = nList.item(temp);
                countOfBook++;
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == 1) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : " + eElement.getAttribute("id"));
                    System.out.println("Author : " + eElement.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Genre : " + eElement.getElementsByTagName("genre").item(0).getTextContent());
                    System.out.println("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    price = Double.valueOf(eElement.getElementsByTagName("price").item(0).getTextContent());
                    sum += price;
                    System.out.println("Publish Date : " + eElement.getElementsByTagName("publish_date").item(0).getTextContent());
                    System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
                }

            }

            System.out.println("Count Of Book: " + countOfBook);
            System.out.println("Arithmetic-mean: " + (arithmetic_Mean = sum / countOfBook));
        } catch (Exception var9) {
            System.out.println(var9.getMessage());
        }
    }
}


