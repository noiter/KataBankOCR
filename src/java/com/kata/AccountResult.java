package com.kata;

public class AccountResult {
    public static final String ILLEGIBLE_FLAG = "ILL";
    public static final String ERROR_FLAG = "ERR";
    private final Output output;
    private final Checksum checksum;
    private String account;
    private EntryParser entryParser;

    public AccountResult(String originalAccount, Output output) {
        this.entryParser = new EntryParser();
        this.account = entryParser.parse(originalAccount);
        this.output = output;
        this.checksum = new Checksum();
    }

    public void printAccountResult() {
        if(account.contains(entryParser.SUBSTITUTE_WHEN_ILLEGIBLE))  {
            output.print(account + " " + ILLEGIBLE_FLAG);
            return;
        }
        if (checksum.validate(account)) {
            output.print(account);
        } else {
            output.print(account + " " + ERROR_FLAG);
        }
    }
}
