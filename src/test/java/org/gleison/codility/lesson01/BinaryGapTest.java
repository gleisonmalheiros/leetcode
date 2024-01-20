package org.gleison.codility.lesson01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class BinaryGapTest {

    BinaryGap bg;

    @BeforeEach
    void setUp() {
        bg = new BinaryGap();
    }

    @Test
    void solutionTest1() {

        int actual = bg.solution(9); // 1001
        int expected = 2;
        assertEquals(expected, actual);

        actual = bg.solution(529); // 1000010001
        expected = 4;
        assertEquals(expected, actual);

        actual = bg.solution(20); // 10100
        expected = 1;
        assertEquals(expected, actual);

        actual = bg.solution(15); // 1111
        expected = 0;
        assertEquals(expected, actual);

        actual = bg.solution(32); // 100000
        expected = 0;
        assertEquals(expected, actual);

        actual = bg.solution(1041); // 10000010001
        expected = 5;
        assertEquals(expected, actual);
    }
}