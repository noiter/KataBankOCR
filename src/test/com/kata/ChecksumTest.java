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
    public void put_account_into_ordered_queue() {
        //given
        String account = "34";

        //when
        double queue = new Checksum().validate(account);

        //then
        assertThat(queue, is(0.0));
    }
}
