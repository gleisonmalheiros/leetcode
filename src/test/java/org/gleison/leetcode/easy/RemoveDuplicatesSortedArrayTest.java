package org.gleison.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class RemoveDuplicatesSortedArrayTest {

    RemoveDuplicatesSortedArray rdsa;

    @BeforeEach
    void setUp() {
        rdsa = new RemoveDuplicatesSortedArray();
    }

    @Test
    void removeDuplicatesTest1() {
        int[] nums_actual = new int[]{1,1,2};
        int[] nums_expected = new int[]{1,2};

        int actual = rdsa.removeDuplicates(nums_actual);
        int expected = nums_expected.length;

        // testing the "k" number, which is how many non-duplicates numbers in the array
        assertEquals(expected, actual);

        // testing now the arrays itself, testing by each item because the arrays will be different, but the first items should be the same-
        for (int i = 0; i < expected; i++) {
            assertEquals(nums_expected[i], nums_actual[i]);
        }
    }

    @Test
    void removeDuplicatesTest2() {
        int[] nums_actual = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums_expected = new int[]{0,1,2,3,4};

        int actual = rdsa.removeDuplicates(nums_actual);
        int expected = nums_expected.length;

        // testing the "k" number, which is how many non-duplicates numbers in the array
        assertEquals(expected, actual);

        // testing now the arrays itself, testing by each item because the arrays will be different, but the first items should be the same-
        for (int i = 0; i < expected; i++) {
            assertEquals(nums_expected[i], nums_actual[i]);
        }
    }

}