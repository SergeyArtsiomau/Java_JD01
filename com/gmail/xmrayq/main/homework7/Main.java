package com.gmail.xmrayq.main.homework7;

public class Main {

    public static void main(String[] args) {

        Symbols symbols = new Symbols();
        symbols.matchSymbols();

        LinesWithWordCatOrDogService linesWithWordCatOrDogService = new LinesWithWordCatOrDogService();
        linesWithWordCatOrDogService.checkOfLines();

        DeleteSpaceString deleteSpaceString = new DeleteSpaceString();
        deleteSpaceString.spaceSuppression();


    }
}
