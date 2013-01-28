package com.kata;

import java.util.HashMap;
import java.util.Map;

public class EntryParser {

    public static final int LENGTH_OF_EACH_NUMBER = 3;
    public static final int LENGTH_OF_EACH_LINE = 27;
    private static final Map<String, Integer> mapper = new HashMap<String, Integer>();

    static {
        mapper.put(" _ " +
                "| |" +
                "|_|", 0);
        mapper.put("   " +
                "  |" +
                "  |", 1);
        mapper.put(" _ " +
                " _|" +
                "|_ ", 2);
        mapper.put(" _ " +
                " _|" +
                " _|", 3);
        mapper.put("   " +
                "|_|" +
                "  |", 4);
        mapper.put(" _ " +
                "|_ " +
                " _|", 5);
        mapper.put(" _ " +
                "|_ " +
                "|_|", 6);
        mapper.put(" _ " +
                "  |" +
                "  |", 7);
        mapper.put(" _ " +
                "|_|" +
                "|_|", 8);
        mapper.put(" _ " +
                "|_|" +
                " _|", 9);
    }

    public String parse(String[] originalAccount) {
        String account = "";
        for( int digitStart = 0, digitEnd = digitStart + LENGTH_OF_EACH_NUMBER;
             digitEnd <= LENGTH_OF_EACH_LINE; digitStart = digitEnd, digitEnd = digitStart + 3) {
            account += mapper.get(getKeyFromMap(originalAccount, digitStart, digitEnd)).toString();
        }
        return account;
    }

    private String getKeyFromMap(String[] originalAccount, int start, int end) {
        return originalAccount[0].substring(start, end) +
                originalAccount[1].substring(start, end) +
                originalAccount[2].substring(start, end);
    }
}
