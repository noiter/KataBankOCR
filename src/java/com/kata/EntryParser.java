package com.kata;

import java.util.HashMap;
import java.util.Map;

public class EntryParser {

    public static final int LENGTH_OF_EACH_LINE = 27;
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
    }

    public String parse(String originalAccount) {
        String account = "";
        String singleAccount = "";
        for(int i = 0, t = i + 3; i <= 24; i = t, t = i + 3){
            for(int j = 0; j < 3; j++) {
                singleAccount += originalAccount.substring(i + j * LENGTH_OF_EACH_LINE, t + j * LENGTH_OF_EACH_LINE);
            }
            account += mapper.get(singleAccount);
            singleAccount = "";
        }
        return account;
    }
}
