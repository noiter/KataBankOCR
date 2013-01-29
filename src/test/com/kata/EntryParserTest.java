package com.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EntryParserTest {

    private EntryParser entryParser = new EntryParser();

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

//    @Test
//    public void should_parse_3() {
//        //given
//        String three =
//                "" +
//                        " _ " +
//                        " _|" +
//                        " _|";
//        //then
//        assertThat(entryParser.parse(three), is("3"));
//    }
//
//    @Test
//     public void should_parse_4() {
//        //given
//        String four =
//                "" +
//                        "   " +
//                        "|_|" +
//                        "  |";
//        //then
//        assertThat(entryParser.parse(four), is("4"));
//    }
//
//    @Test
//     public void should_parse_5() {
//        //given
//        String five =
//                "" +
//                        " _ " +
//                        "|_ " +
//                        " _|";
//        //then
//        assertThat(entryParser.parse(five), is("5"));
//    }
//
//    @Test
//     public void should_parse_6() {
//        //given
//        String six =
//                "" +
//                        " _ " +
//                        "|_ " +
//                        "|_|";
//        //then
//        assertThat(entryParser.parse(six), is("6"));
//    }
//
//    @Test
//     public void should_parse_7() {
//        //given
//        String seven =
//                "" +
//                        " _ " +
//                        "  |" +
//                        "  |";
//        //then
//        assertThat(entryParser.parse(seven), is("7"));
//    }
//
//    @Test
//     public void should_parse_8() {
//        //given
//        String eight =
//                "" +
//                        " _ " +
//                        "|_|" +
//                        "|_|";
//        //then
//        assertThat(entryParser.parse(eight), is("8"));
//    }
//
//    @Test
//     public void should_parse_9() {
//        //given
//        String nine =
//                "" +
//                        " _ " +
//                        "|_|" +
//                        " _|";
//        //then
//        assertThat(entryParser.parse(nine), is("9"));
//    }
//
//    @Test
//     public void should_parse_a_account() {
//        //given
//        String nine =
//                "" +
//                        "    _  _     _  _  _  _  _ " +
//                        "  | _| _||_||_ |_   ||_||_|" +
//                        "  ||_  _|  | _||_|  ||_| _|";
//        //then
//        assertThat(entryParser.parse(nine), is("123456789"));
//    }
}
