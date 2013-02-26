package com.kata;

import java.util.*;

public class Correcter {

    private static final Map<String, List> mapper = new HashMap<String, List>();

    static {
        mapper.put("0", Arrays.asList("8"));
        mapper.put("1", Arrays.asList("7"));
        mapper.put("3", Arrays.asList("9"));
        mapper.put("5", Arrays.asList("6", "9"));
        mapper.put("6", Arrays.asList("5", "8"));
        mapper.put("7", Arrays.asList("1"));
        mapper.put("8", Arrays.asList("0", "6", "9"));
        mapper.put("9", Arrays.asList("3", "5", "8"));

    }

    public List<String> correct(String accountStr) {
        List<String> accountList = new ArrayList<String>();

        for (int i = 0; i < accountStr.length(); i++) {
            if (mapper.containsKey(accountStr.substring(i, i + 1))) {
                for (int j = 0; j < mapper.get(accountStr.substring(i, i + 1)).size(); j++) {
                    String newAccount = (String) mapper.get(accountStr.substring(i, i + 1)).get(j);
                    newAccount = accountStr.substring(0, i) + newAccount + accountStr.substring(i + 1, accountStr.length());
                    accountList.add(newAccount);
                }
            }
        }
        return accountList;
    }
}
