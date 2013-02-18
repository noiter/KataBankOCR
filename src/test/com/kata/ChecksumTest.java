package com.kata;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        Boolean result = new Checksum().validate(account);

        //then
        assertFalse(result);
    }

    @Test
    public void do_check_on_a_complete_account() {
        //given
        String account = "345882865";

        //when
        Boolean result = new Checksum().validate(account);

        //then
        assertTrue(result);
    }

    @Test
    public void do_check_on_another_complete_account() {
        //given
        String account = "457508000";

        //when
        Boolean result = new Checksum().validate(account);

        //then
        assertTrue(result);
    }
}
