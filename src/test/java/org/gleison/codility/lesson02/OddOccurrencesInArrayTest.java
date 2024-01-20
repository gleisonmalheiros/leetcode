package org.gleison.codility.lesson02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class OddOccurrencesInArrayTest {

    OddOccurrencesInArray odd;

    @BeforeEach
    void setUp() {
        odd = new OddOccurrencesInArray();
    }

    @Test
    void solutionTest1() {
        int[] p1 = new int[]{9, 3, 9, 3, 9, 7, 9};

        int actual = odd.solution(p1);
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        int[] p1 = new int[]{1, 2, 3, 4, 1, 2, 3};

        int actual = odd.solution(p1);
        int expected = 4;

        assertEquals(expected, actual);
    }

}