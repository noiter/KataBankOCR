package com.kata;

public class Checksum {

    public static final int FACTOR = 11;

    public double validate(String account) {

        return (double) (checkSumOnAccount(account) % FACTOR);
    }

    private int checkSumOnAccount(String account) {
        int accountLength = account.length();
        int[] queue = getQueueOfAccount(account);
        int sum = 0;

        for (int position = 1; position <= accountLength; position++) {
            sum += position * queue[accountLength - position];
        }
        return sum;
    }

    private int[] getQueueOfAccount(String account) {
        int[] queue = new int[account.length()];

        for (int startIndex = 0; startIndex < account.length(); startIndex++) {
            queue[startIndex] = Integer.parseInt(account.substring(startIndex, startIndex + 1));
        }
        return queue;
    }
}
