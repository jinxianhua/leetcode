package com.company;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("3",3);
        linkedHashMap.put("1",1);
        linkedHashMap.put("2",2);

        System.out.println( linkedHashMap.toString());
    }
}
