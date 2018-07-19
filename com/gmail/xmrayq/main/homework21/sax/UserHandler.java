package com.gmail.xmrayq.main.homework21.sax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

    boolean bAuthor = false;
    boolean bTitle = false;
    boolean bGenre = false;
    boolean bPrice = false;
    boolean bPublishDate = false;
    boolean bDescription = false;
    int countOfBook = 0;
    private Double arithmetic_Mean = null;
    double sum = 0;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("book")) {
            countOfBook++;
            String id = attributes.getValue("id");
            System.out.println("ID : " + id);
        } else if (qName.equalsIgnoreCase("author")) {
            bAuthor = true;
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("genre")) {
            bGenre = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        } else if (qName.equalsIgnoreCase("publish_date")) {
            bPublishDate = true;
        } else if (qName.equalsIgnoreCase("description")) {
            bDescription = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("book")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {

        if (bAuthor) {
            System.out.println("Author: " + new String(ch, start, length));
            bAuthor = false;
        } else if (bTitle) {
            System.out.println("Title: " + new String(ch, start, length));
            bTitle = false;
        } else if (bGenre) {
            System.out.println("Genre: " + new String(ch, start, length));
            bGenre = false;
        } else if (bPrice) {
            String value = new String(ch, start, length);
            System.out.println("Price: " + value);
            sum += Double.valueOf(value);
            bPrice = false;
        } else if (bPublishDate) {
            System.out.println("Publish Date: " + new String(ch, start, length));
            bPublishDate = false;
        } else if (bDescription) {
            System.out.println("Marks: " + new String(ch, start, length));
            bDescription = false;
        }
    }

    @Override
    public void endDocument() {
        System.out.println("Count Of Book: " + countOfBook);
        System.out.println("Arithmetic-mean: " + (arithmetic_Mean = sum / countOfBook));

    }
}