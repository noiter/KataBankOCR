package com.kata;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/*
 * Tasking:
 * 1) Print a account
 * 2) Print a correct account with checksum
 * 3) Print a ERR account
 * 4) Print a ILL account
 */

public class AccountResultTest {

    private Output mockOutput;

    @Before
    public void setUp() throws Exception {
        mockOutput = mock(Output.class);
    }

    @Test
    public void print_whatever_account() throws Exception {
        //given
        String accountSource = "" +
                "    _  _     _  _  _  _  _ " +
                "  | _| _||_||_ |_   ||_||_|" +
                "  ||_  _|  | _||_|  ||_| _|";


        //when
        new AccountResult(accountSource, mockOutput).printAccountResult();

        //then
        verify(mockOutput).print("123456789");
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
        new AccountResult(accountSource, mockOutput).printAccountResult();

        //then
        verify(mockOutput).print("457508000");
    }

//    @Test
//    public void print_a_error_account_with_checksum() throws Exception {
//        //given
//        String accountSource =
//                "" +
//                        " _  _     _  _        _  _ " +
//                        "|_ |_ |_| _|  |  ||_||_||_ " +
//                        "|_||_|  | _|  |  |  | _| _|";
//
//        //when
//        new AccountResult(accountSource, mockOutput).printAccountResult();
//
//        //then
//        verify(mockOutput).print("664371495 ERR");
//    }

}
