package com.kata;

public class AccountResult {
    private String account;
    private final Output output;
    private final Checksum checksum;

    public AccountResult(String account, Output output) {
        this.account = new EntryParser().parse(account);
        this.output = output;
        this.checksum = new Checksum();
    }

    public void printAccountResult() {
        checksum.validate(account);
        output.print(account);
    }
}
