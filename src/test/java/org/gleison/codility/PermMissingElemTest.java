package org.gleison.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class PermMissingElemTest {

    PermMissingElem pme;

    @BeforeEach
    void setUp() {
        pme = new PermMissingElem();
    }

    @Test
    void solutionTestEdgeCases() {

        // empty array, number 1 is missing
        int actual = pme.solution(new int[]{});
        int expected = 1;
        assertEquals(expected, actual);

        // doesn't start with 1, then 1
        actual = pme.solution(new int[]{5, 2, 3, 4});
        expected = 1;
        assertEquals(expected, actual);

        // no missing element, then next logical number
        actual = pme.solution(new int[]{5, 2, 3, 4, 1});
        expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTestNormalCase() {
        int actual = pme.solution(new int[]{2, 3, 1, 5});
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTestSingle() {
        int actual = pme.solution(new int[]{1});
        int expected = 2;
        assertEquals(expected, actual);

        actual = pme.solution(new int[]{2});
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTestDouble() {
        int actual = pme.solution(new int[]{1, 2});
        int expected = 3;
        assertEquals(expected, actual);

        actual = pme.solution(new int[]{2, 3});
        expected = 1;
        assertEquals(expected, actual);
    }

}