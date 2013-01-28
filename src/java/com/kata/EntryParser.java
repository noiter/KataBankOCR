package com.kata;

import java.util.HashMap;
import java.util.Map;

public class EntryParser {

    private final static Map<String, String> mapper =new HashMap<String, String>();
    static {
        mapper.put(" _ " +
                   "| |" +
                   "|_|", "0");
        mapper.put("   " +
                   "  |" +
                   "  |", "1");
        mapper.put(" _ " +
                   " _|" +
                   "|_ ", "2");
        mapper.put(" _ " +
                   " _|" +
                   " _|","3");
        mapper.put("   " +
                   "|_|" +
                   "  |", "4");
        mapper.put(" _ " +
                   "|_ " +
                   " _|", "5");
        mapper.put(" _ " +
                   "|_ " +
                   "|_|", "6");
        mapper.put(" _ " +
                   "  |" +
                   "  |", "7");
        mapper.put(" _ " +
                   "|_|" +
                   "|_|", "8");
        mapper.put(" _ " +
                   "|_|" +
                   " _|", "9");
    }

    public String parse(String number) {
        if(mapper.containsKey(number))
            return mapper.get(number);
        else
            return "NaN";
    }
}
