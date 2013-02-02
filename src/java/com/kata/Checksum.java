package com.kata;

public class Checksum {

    public int[] validate(String account) {
        int[] accountQueue = new int[9];
        for (int i = 0; i < 9; i++) {
            accountQueue[i] = Integer.parseInt(account.substring(i, i + 1));
        }
        return accountQueue;
    }
}
