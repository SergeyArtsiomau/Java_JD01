package com.gmail.xmrayq.main.homework11;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollecton {

    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<String, String>();
        stringMap.put("1", "first");
        stringMap.put("2", "second");
        stringMap.put("3", "three");
        stringMap.put("4", "four");
        stringMap.put("5", "five");
        stringMap.put("6", "six");
        stringMap.put("7", "seven");
        stringMap.put("8", "eight");
        stringMap.put("9", "nine");
        stringMap.put("10", "ten");

        printKeys(stringMap);


    }

    public static void printKeys(Map<String, String> stringMap) {
        for (Map.Entry<String, String> element : stringMap.entrySet()) {
            String key = element.getKey();
            System.out.println(key);
        }

    }
}