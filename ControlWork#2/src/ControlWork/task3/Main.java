package ControlWork.task3;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        try (
                InputStream xml = new FileInputStream("sheme.xml");
                InputStream xsd = new FileInputStream("sheme.xsd")
        ) {
            System.out.println("Validation xml against XSD:" + validateXMLbyXSD(xml, xsd));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean validateXMLbyXSD(InputStream xml, InputStream xsd) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}

