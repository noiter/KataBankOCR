package com.kata;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
 * Tasking
 * 1) correct composition only has one probability-number
 * 2) correct composition has two probability-numbers
 * 3) correct composition only contains one number which has more than one prob
 * 4) correct composition contains numbers which have more than one prob
 */
public class CorrecterTest {

    @Test
    public void correct_composition_only_has_one_probability_number() throws Exception {
        //given
        String composition = "122222222";

        //when
        List<String> expected = new Correcter().correct(composition);

        //then
        assertThat(expected.contains("722222222"), is(true));

    }

    @Test
    public void correct_composition_has_two_probability_numbers() throws Exception {
        //given
        String composition = "012222222";

        //when
        List<String> expected = new Correcter().correct(composition);

        //then
        assertThat(expected.contains("812222222"), is(true));
        assertThat(expected.contains("072222222"), is(true));
    }

    @Test
    public void correct_composition_contains_only_one_number_which_has_more_than_one_prob() throws Exception {
        //given
        String composition = "522222222";

        //when
        List<String> expected = new Correcter().correct(composition);

        //then
        assertThat(expected.contains("622222222"), is(true));
        assertThat(expected.contains("922222222"), is(true));
    }

    @Test
    public void correct_composition_contains_numbers_which_have_more_than_one_prob() throws Exception {
        //given
        String composition = "522228222";

        //when
        List<String> expected = new Correcter().correct(composition);

        //then
        assertThat(expected.contains("622228222"), is(true));
        assertThat(expected.contains("922228222"), is(true));
        assertThat(expected.contains("522220222"), is(true));
        assertThat(expected.contains("522226222"), is(true));
        assertThat(expected.contains("522229222"), is(true));
    }
}
