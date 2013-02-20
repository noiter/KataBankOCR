package com.kata;

import java.util.ArrayList;
import java.util.List;

public class AccountResult {

    public static final String ILLEGIBLE_FLAG = " ILL";
    public static final String ERROR_FLAG = " ERR";

    private Output output;
    private Checksum checksum;
    private EntryParser entryParser;

    private final List<String> accounts = new ArrayList<String>();
    private String account;

    public AccountResult(String originalAccount, Output output) {
        this.entryParser = new EntryParser();
        this.checksum = new Checksum();
        this.output = output;
        this.account = entryParser.parse(originalAccount);
    }

    public AccountResult(List<String> accounts, Output output) {
        this.entryParser = new EntryParser();
        this.checksum = new Checksum();
        this.output = output;
        for (String account : accounts) {
            this.accounts.add(entryParser.parse(account));
        }
    }

    public void printAccountResult() {
        if (account.contains(entryParser.SUBSTITUTE_WHEN_ILLEGIBLE)) {
            output.print(account + ILLEGIBLE_FLAG);
            return;
        }
        output.print((checksum.validate(account)) ? account : (account + ERROR_FLAG));
    }

    public void printAccountsResult() {
        for (String account : this.accounts) {
            if (account.contains(entryParser.SUBSTITUTE_WHEN_ILLEGIBLE)) {
                output.print(account + ILLEGIBLE_FLAG);
                return;
            }
            output.print((checksum.validate(account)) ? account : (account + ERROR_FLAG));
        }
    }
}
