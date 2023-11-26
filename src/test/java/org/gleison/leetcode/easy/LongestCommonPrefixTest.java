package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class LongestCommonPrefixTest {

    LongestCommonPrefix lcp;

    @BeforeEach
    void setUp() {
        lcp = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix1() {
        String[] words = {"flower", "flow", "flight"};

        String actual = lcp.longestCommonPrefix(words);
        String expected = "fl";

        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefix2() {
        String[] words = {"dog", "racecar", "car"};

        String actual = lcp.longestCommonPrefix(words);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefix3() {
        String[] words = {"undercook", "underestimate", "underwear", "underdog", "under"};

        String actual = lcp.longestCommonPrefix(words);
        String expected = "under";

        assertEquals(expected, actual);
    }

}