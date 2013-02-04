package com.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Tasking:
    1) Checksum on an account's first two numbers
    2) do checksum on an account
 */
public class ChecksumTest {

    @Test
    public void do_check_on_an_account_first_two_numbers() {
        //given
        String account = "34";

        //when
        double queue = new Checksum().validate(account);

        //then
        assertThat(queue, is(10.0));
    }

    @Test
    public void do_check_on_a_complete_account() {
        //given
        String account = "345882865";

        //when
        double queue = new Checksum().validate(account);

        //then
        assertThat(queue, is(0.0));
    }
}
