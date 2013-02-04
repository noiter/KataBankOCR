package com.kata;

public class Checksum {

    public static final int FACTOR = 11;

    public double validate(String account) {
        int sum = 0;
        int accountLength = account.length();
        int[] queue = new int[accountLength];

        for (int startIndex = 0; startIndex < accountLength; startIndex++) {
            queue[startIndex] = Integer.parseInt(account.substring(startIndex, startIndex + 1));
        }
        for (int position = 1; position <= accountLength; position++) {
            sum += position * queue[accountLength - position];
        }

        return (double) (sum % FACTOR);
    }
}
