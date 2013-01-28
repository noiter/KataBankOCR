package com.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntryParserTest {

    private EntryParser entryParser = new EntryParser();

    @Test
    public void shouldParseAccountWhenAllDigitsAreZero() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "| || || || || || || || || |",
                                                "|_||_||_||_||_||_||_||_||_|"};
        assertEqualsAfterParsing(originalAccount, "000000000");
    }

    @Test
    public void shouldParseAccountWhenFirstDigitsIsOneAndRestAreZero() {

        //given
        String[] originalAccount = new String[]{"    _  _  _  _  _  _  _  _ ",
                                                "  || || || || || || || || |",
                                                "  ||_||_||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "100000000");
    }

    @Test
    public void shouldParseAccountWhenFirstDigitsIsTwoAndRestAreZero() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                " _|| || || || || || || || |",
                                                "|_ |_||_||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "200000000");
    }

    @Test
    public void shouldParseAccountWhenFirstTwoAreOneTwoAndRestAreZero() {

        //given
        String[] originalAccount = new String[]{"    _  _  _  _  _  _  _  _ ",
                                                "  | _|| || || || || || || |",
                                                "  ||_ |_||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "120000000");
    }

    @Test
    public void shouldParseAccountWhenFirstThreeAreOneTwoThreeAndRestAreZero() {

        //given
        String[] originalAccount = new String[]{"    _  _  _  _  _  _  _  _ ",
                                                "  | _| _|| || || || || || |",
                                                "  ||_  _||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "123000000");
    }

    @Test
    public void shouldParseAccountWhenAllAreOne() {

        //given
        String[] originalAccount = new String[]{"                           ",
                                                "  |  |  |  |  |  |  |  |  |",
                                                "  |  |  |  |  |  |  |  |  |"};

        assertEqualsAfterParsing(originalAccount, "111111111");
    }

    @Test
    public void shouldParseAccountWhenAllAreFour() {

        //given
        String[] originalAccount = new String[]{"                           ",
                                                "|_||_||_||_||_||_||_||_||_|",
                                                "  |  |  |  |  |  |  |  |  |"};

        assertEqualsAfterParsing(originalAccount, "444444444");
    }

    @Test
    public void shouldParseAccountWhenAllAreFive() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                                " _| _| _| _| _| _| _| _| _|"};

        assertEqualsAfterParsing(originalAccount, "555555555");
    }

    @Test
    public void shouldParseAccountWhenAllAreSix() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                                "|_||_||_||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "666666666");
    }

    @Test
    public void shouldParseAccountWhenAllAreSeven() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "  |  |  |  |  |  |  |  |  |",
                                                "  |  |  |  |  |  |  |  |  |"};

        assertEqualsAfterParsing(originalAccount, "777777777");
    }

    @Test
    public void shouldParseAccountWhenAllAreEight() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "|_||_||_||_||_||_||_||_||_|",
                                                "|_||_||_||_||_||_||_||_||_|"};

        assertEqualsAfterParsing(originalAccount, "888888888");
    }

    @Test
    public void shouldParseAccountWhenAllAreNine() {

        //given
        String[] originalAccount = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                                "|_||_||_||_||_||_||_||_||_|",
                                                " _| _| _| _| _| _| _| _| _|"};

        assertEqualsAfterParsing(originalAccount, "999999999");
    }

    @Test
    public void shouldParseAccount() {

        //given
        String[] originalAccount = new String[]{"    _  _     _  _  _  _  _ ",
                                                "  | _| _||_||_ |_   ||_||_|",
                                                "  ||_  _|  | _||_|  ||_| _|"};

        assertEqualsAfterParsing(originalAccount, "123456789");
    }

    private void assertEqualsAfterParsing(String[] originalAccount, String expectedAccount) {
        //when
        String actualAccountNumber = entryParser.parse(originalAccount);

        //then
        assertEquals(expectedAccount, actualAccountNumber);
    }
}
