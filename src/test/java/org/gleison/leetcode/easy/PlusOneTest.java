package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne po;

    @BeforeEach
    void setUp() {
        po = new PlusOne();
    }

    @Test
    void plusOne1() {
        int[] digits = new int[]{1,2,3};

        int[] actual = po.plusOne(digits);
        int[] expected = new int[]{1,2,4};

        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne2() {
        int[] digits = new int[]{9};

        int[] actual = po.plusOne(digits);
        int[] expected = new int[]{1,0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne3() {
        int[] digits = new int[]{4,3,2,1};

        int[] actual = po.plusOne(digits);
        int[] expected = new int[]{4,3,2,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne4() {
        int[] digits = new int[]{9,1,1,2,3,5,4,6,9,8,4,1};

        int[] actual = po.plusOne(digits);
        int[] expected = new int[]{9,1,1,2,3,5,4,6,9,8,4,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne5() {
        int[] digits = new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};

        int[] actual = po.plusOne(digits);
        int[] expected = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        assertArrayEquals(expected, actual);
    }

}