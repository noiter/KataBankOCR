package com.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Tasking:
    1) split each digit from account string
    2) figure each digit's position among the string
    3) do checksum
 */
public class ChecksumTest {

    @Test
    public void put_account_into_ordered_queue() {
        //given
        String account = "345882865";
        int[] queue;

        //when
        queue = new Checksum().validate(account);

        //then
        assertThat(queue, is(new int[]{3, 4, 5, 8, 8, 2, 8, 6, 5}));
    }
}
