package com.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/*
 * Tasking:
 * 1) Print a correct account with checksum
 * 2) Print a ERR account
 * 3) Print a ILL account
 * 4) Print more than one account
 */

public class AccountResultTest {

    private Output mockOutput;

    @Before
    public void setUp() throws Exception {
        mockOutput = mock(Output.class);
    }

    @Test
    public void print_a_correct_account_with_checksum() throws Exception {
        //given
        String accountSource =
                "" +
                        "    _  _  _  _  _  _  _  _ " +
                        "|_||_   ||_ | ||_|| || || |" +
                        "  | _|  | _||_||_||_||_||_|";

        //when
        new AccountResult(accountSource, mockOutput).printAccountsResult();

        //then
        verify(mockOutput).print("457508000");
    }

    @Test
    public void print_a_error_account_with_checksum() throws Exception {
        //given
        String accountSource =
                "" +
                        " _  _     _  _        _  _ " +
                        "|_ |_ |_| _|  |  ||_||_||_ " +
                        "|_||_|  | _|  |  |  | _| _|";

        //when
        new AccountResult(accountSource, mockOutput).printAccountsResult();

        //then
        verify(mockOutput).print("664371495 ERR");
    }

    @Test
    public void print_a_illegible_account_with_checksum() throws Exception {
        //given
        String accountSource =
                "" +
                        " _  _        _        _  _ " +
                        "|_||_   |  || || ||_  _||_ " +
                        "|_||_|  |  ||_| _|| | _||_|";

        //when
        new AccountResult(accountSource, mockOutput).printAccountsResult();

        //then
        verify(mockOutput).print("86110??36 ILL");
    }

    @Test
    public void print_account_array_with_checksum() throws Exception {
        //given
        String accountSource1 =
                "" +
                        "    _  _  _  _  _  _  _  _ " +
                        "|_||_   ||_ | ||_|| || || |" +
                        "  | _|  | _||_||_||_||_||_|";
        String accountSource2 =
                "" +
                        " _  _     _  _        _  _ " +
                        "|_ |_ |_| _|  |  ||_||_||_ " +
                        "|_||_|  | _|  |  |  | _| _|";
        String accountSource3 =
                "" +
                        " _  _        _        _  _ " +
                        "|_||_   |  || || ||_  _||_ " +
                        "|_||_|  |  ||_| _|| | _||_|";

        List<String> accounts = Arrays.asList(accountSource1, accountSource2, accountSource3);

        //when
        new AccountResult(accounts, mockOutput).printAccountsResult();

        //then
        verify(mockOutput).print("457508000");
        verify(mockOutput).print("664371495 ERR");
        verify(mockOutput).print("86110??36 ILL");
    }
}
