package ControlWork.task4;

import ControlWork.task4.DOM.DOM;
import ControlWork.task4.SAX.ShemeService;

public class Main {

    public static void main(String[] args) {


        FactoryMethod domParser = DOM.getInstance();
        domParser.parse();

        FactoryMethod shemeService = ShemeService.getInstance();
        shemeService.parse();

    }
}
