package com.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountResult {

    public static final String ILLEGIBLE_FLAG = " ILL";
    public static final String ERROR_FLAG = " ERR";
    public static final String MULTIPLE_PROB_FLAG = " AMB";

    private Output output;
    private Checksum checksum;
    private EntryParser entryParser;

    private final List<String> accounts = new ArrayList<String>();

    public AccountResult(List<String> accounts, Output output) {
        this.entryParser = new EntryParser();
        this.checksum = new Checksum();
        this.output = output;
        for (String account : accounts) {
            this.accounts.add(entryParser.parse(account));
        }
    }

    public AccountResult(String originalAccount, Output output) {
        this(Arrays.asList(originalAccount), output);
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

    public void printAccountsResultAfterCorrected() {

        for (String account : this.accounts) {
            //print account result with correcter
            if (!checksum.validate(account)) {
                estimatePerAccountAfterCorrected(account);
            } else {
                output.print(account);
            }
        }
    }

    private void estimatePerAccountAfterCorrected(String account) {
        List<String> accountsAfterCorrected = new Correcter().correct(account);
        List<String> tempAccounts = new ArrayList<String>();

        for (String accountAfterCorrected : accountsAfterCorrected) {
            if (checksum.validate(accountAfterCorrected)) {
                tempAccounts.add(accountAfterCorrected);
            }
        }

        estimateFinalResult(account, tempAccounts);
    }

    private void estimateFinalResult(String account, List<String> accounts) {
        if (accounts.size() == 1) {
            output.print(accounts.get(0));
        } else if (accounts.size() < 1) {
            output.print(account + ILLEGIBLE_FLAG);
        } else {
            output.print(account + MULTIPLE_PROB_FLAG);
        }
    }
}
