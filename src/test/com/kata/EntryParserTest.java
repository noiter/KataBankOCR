package com.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EntryParserTest {

    private EntryParser entryParser = new EntryParser();

    @Test
    public void should_parse_0() {
        //given
        String zero =
                "" +
                        " _ " +
                        "| |" +
                        "|_|";
        //then
        assertThat(entryParser.parse(zero), is("0"));
    }

    @Test
    public void should_parse_1() {
        //given
        String one =
                "" +
                        "   " +
                        "  |" +
                        "  |";
        //then
        assertThat(entryParser.parse(one), is("1"));
    }

    @Test
    public void should_parse_2() {
        //given
        String one =
                "" +
                        " _ " +
                        " _|" +
                        "|_ ";
        //then
        assertThat(entryParser.parse(one), is("2"));
    }
}
