package org.gleison.codility.lesson03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class TapeEquilibriumTest {

    TapeEquilibrium te;

    @BeforeEach
    void setUp() {
        te = new TapeEquilibrium();
    }

    @Test
    void solutionTest1() {

        int actual = te.solution(new int[]{});
        int expected = 0;
        assertEquals(expected, actual);

        actual = te.solution(new int[]{9});
        expected = 9;
        assertEquals(expected, actual);

        actual = te.solution(new int[]{8, 9});
        expected = 1;
        assertEquals(expected, actual);

        actual = te.solution(new int[]{3, 1, 2, 4, 3});
        expected = 1;
        assertEquals(expected, actual);

    }
}