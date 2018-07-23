package ControlWork.task4.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


public class UserHandler extends DefaultHandler {


    private double totalPrice;
    private boolean bProductName;
    private boolean bUSPrice;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("ProductName")) {
            bProductName = true;
        } else if (qName.equalsIgnoreCase("USPrice")) {
            bUSPrice = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (bProductName) {
            System.out.println("Product name: " + new String(ch, start, length));
            bProductName = false;
        } else if (bUSPrice) {
            System.out.println("Price: " + new String(ch, start, length));
            totalPrice += Double.valueOf(new String(ch, start, length));
            bUSPrice = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {

    }

    @Override
    public void endDocument() {
        System.out.println("Total price: " + totalPrice);
    }
}
