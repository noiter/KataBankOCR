package com.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EntryParserTest {

    private EntryParser entryParser = new com.kata.EntryParser();

    @Test
    public void parse_account_when_all_are_0() {
        //given
        String zero =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "| || || || || || || || || |" +
                        "|_||_||_||_||_||_||_||_||_|";
        //then
        assertThat(entryParser.parse(zero), is("000000000"));
    }

    @Test
    public void parse_account_when_all_are_1() {
        //given
        String one =
                "" +
                        "                           " +
                        "  |  |  |  |  |  |  |  |  |" +
                        "  |  |  |  |  |  |  |  |  |";
        //then
        assertThat(entryParser.parse(one), is("111111111"));
    }

    @Test
    public void parse_account_when_all_are_2() {
        //given
        String two =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        " _| _| _| _| _| _| _| _| _|" +
                        "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
        //then
        assertThat(entryParser.parse(two), is("222222222"));
    }

    @Test
    public void parse_account_when_all_are_3() {
        //given
        String three =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        " _| _| _| _| _| _| _| _| _|" +
                        " _| _| _| _| _| _| _| _| _|";
        //then
        assertThat(entryParser.parse(three), is("333333333"));
    }

    @Test
     public void parse_account_when_all_are_4() {
        //given
        String four =
                "" +
                        "                           " +
                        "|_||_||_||_||_||_||_||_||_|" +
                        "  |  |  |  |  |  |  |  |  |";
        //then
        assertThat(entryParser.parse(four), is("444444444"));
    }

    @Test
     public void parse_account_when_all_are_5() {
        //given
        String five =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "|_ |_ |_ |_ |_ |_ |_ |_ |_ " +
                        " _| _| _| _| _| _| _| _| _|";
        //then
        assertThat(entryParser.parse(five), is("555555555"));
    }

    @Test
     public void parse_account_when_all_are_6() {
        //given
        String six =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "|_ |_ |_ |_ |_ |_ |_ |_ |_ " +
                        "|_||_||_||_||_||_||_||_||_|";
        //then
        assertThat(entryParser.parse(six), is("666666666"));
    }

    @Test
     public void parse_account_when_all_are_7() {
        //given
        String seven =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "  |  |  |  |  |  |  |  |  |" +
                        "  |  |  |  |  |  |  |  |  |";
        //then
        assertThat(entryParser.parse(seven), is("777777777"));
    }

    @Test
     public void parse_account_when_all_are_8() {
        //given
        String eight =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "|_||_||_||_||_||_||_||_||_|" +
                        "|_||_||_||_||_||_||_||_||_|";
        //then
        assertThat(entryParser.parse(eight), is("888888888"));
    }

    @Test
     public void parse_account_when_all_are_9() {
        //given
        String nine =
                "" +
                        " _  _  _  _  _  _  _  _  _ " +
                        "|_||_||_||_||_||_||_||_||_|" +
                        " _| _| _| _| _| _| _| _| _|";
        //then
        assertThat(entryParser.parse(nine), is("999999999"));
    }

    @Test
     public void should_parse_a_account() {
        //given
        String nine =
                "" +
                        "    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|";
        //then
        assertThat(entryParser.parse(nine), is("123456789"));
    }
}
