package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class RomanToIntegerTest {

    RomanToInteger rti;

    @BeforeEach
    void setUp() {
        rti = new RomanToInteger();
    }

    @Test
    void romanToInt() {
        assertEquals(3, rti.romanToInt("III"));
        assertEquals(58, rti.romanToInt("LVIII"));
        assertEquals(1994, rti.romanToInt("MCMXCIV"));
        assertEquals(666, rti.romanToInt("DCLXVI"));
        assertEquals(999, rti.romanToInt("CMXCIX"));
        assertEquals(831, rti.romanToInt("DCCCXXXI"));
    }
}