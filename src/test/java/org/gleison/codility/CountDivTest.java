package org.gleison.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class CountDivTest {

    CountDiv cd;

    @BeforeEach
    void setUp() {
        cd = new CountDiv();
    }

    @Test
    void solutionTest1() {

        int actual = cd.solution(6, 11, 2);
        int expected = 3;
        assertEquals(expected, actual);

        actual = cd.solution(1, 10, 2);
        expected = 4;
        assertEquals(expected, actual);

        actual = cd.solution(1, 10, 3);
        expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    void solutionTest2() {

        int actual = cd.solution(100, 123_000_000, 2);
        int expected = 0;
        assertEquals(expected, actual);

        actual = cd.solution(1, 1, 11);
        expected = 0;
        assertEquals(expected, actual);

        actual = cd.solution(0, 1, 11);
        expected = 0;
        assertEquals(expected, actual);

    }

}