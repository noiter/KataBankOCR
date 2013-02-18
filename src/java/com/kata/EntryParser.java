package com.kata;

import java.util.HashMap;
import java.util.Map;

public class EntryParser {

    public static final int LENGTH_OF_EACH_LINE = 27;
    public static final String SUBSTITUTE_WHEN_ILLEGIBLE = "?";
    private static final Map<String, String> mapper = new HashMap<String, String>();
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
                   " _|", "3");
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


    public String parse(String originalAccount) {
        String account = "";
        String singleDigit = "";

        for(int startIndex = 0, endIndex = startIndex + 3; startIndex <= 24; startIndex = endIndex, endIndex = startIndex + 3){
            for(int lineIndex = 0; lineIndex < 3; lineIndex++) {
                singleDigit += originalAccount.substring(startIndex + lineIndex * LENGTH_OF_EACH_LINE,
                        endIndex + lineIndex * LENGTH_OF_EACH_LINE);
            }
            if(mapper.containsKey(singleDigit)) {
                account += mapper.get(singleDigit);
            } else {
                account += SUBSTITUTE_WHEN_ILLEGIBLE;
            }
            singleDigit = "";
        }
        return account;
    }
}
