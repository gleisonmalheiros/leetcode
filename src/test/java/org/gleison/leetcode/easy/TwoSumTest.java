package org.gleison.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test
    void twoSumTest1() {
        int[] nums = {2, 7, 11, 13};
        int target = 9;

        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {1, 2};
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

}