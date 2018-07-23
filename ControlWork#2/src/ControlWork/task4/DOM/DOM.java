package ControlWork.task4.DOM;

import ControlWork.task4.FactoryMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOM extends FactoryMethod {
    private double totalPrice;

    private static DOM instance = null;

    private DOM() {
    }

    public static DOM getInstance() {
        if (instance == null) {
            instance = new DOM();
        }
        return instance;
    }

    @Override
    public String parse() {
        String string = null;

        try {
            File inputFile = new File("sheme.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Item");

            for (int temp = 0; temp < nList.getLength(); ++temp) {
                Node nNode = nList.item(temp);

                if (Node.ELEMENT_NODE == nNode.getNodeType()) {
                    Element eElement = (Element) nNode;
                    System.out.println("Product Name : " + eElement.getElementsByTagName("ProductName").item(0).getTextContent());
                    System.out.println("USPrice : " + eElement.getElementsByTagName("USPrice").item(0).getTextContent());
                }
                if (Node.ELEMENT_NODE == nNode.getNodeType()) {
                    Element eElement = (Element) nNode;
                    totalPrice += Double.valueOf(eElement.getElementsByTagName("USPrice").item(0).getTextContent());
                }
            }
            System.out.println("Total Price: " + totalPrice);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return string;
    }
}



