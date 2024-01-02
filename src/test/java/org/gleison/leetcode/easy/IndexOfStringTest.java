package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class IndexOfStringTest {

    IndexOfString ind;

    @BeforeEach
    void setUp() {
        ind = new IndexOfString();
    }

    @Test
    void indexOfTest1() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int actual = ind.strStr(haystack, needle);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void indexOfTest2() {
        String haystack = "leetcode";
        String needle = "leeto";

        int actual = ind.strStr(haystack, needle);
        int expected = -1;

        assertEquals(expected, actual);
    }

}