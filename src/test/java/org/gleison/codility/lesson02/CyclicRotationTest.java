package org.gleison.codility.lesson02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class CyclicRotationTest {

    CyclicRotation cr;

    @BeforeEach
    void setUp() {
        cr = new CyclicRotation();
    }

    @Test
    void solutionTestExpected() {
        // shift 3 positions
        int[] p1 = new int[]{3, 8, 9, 7, 6};
        int p2 = 3;

        int[] actual = cr.solution(p1, p2);
        int[] expected = new int[]{9, 7, 6, 3, 8};

        assertArrayEquals(expected, actual);

        // shift 4 positions, which in this case does not change anything
        p1 = new int[]{1, 2, 3, 4};
        p2 = 4;

        actual = cr.solution(p1, p2);
        expected = new int[]{1, 2, 3, 4};

        assertArrayEquals(expected, actual);
    }

    @Test
    void solutionTestEdgeCase1() {
        int[] p1 = new int[]{0, 0, 0};
        int p2 = 1;

        int[] actual = cr.solution(p1, p2);
        int[] expected = new int[]{0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void solutionTestEdgeCase2() {
        int[] p1 = new int[]{};
        int p2 = 1;

        int[] actual = cr.solution(p1, p2);
        int[] expected = new int[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void solutionTestEdgeCase3() {
        int[] p1 = new int[]{1, 2, 3, 4, 5};
        int p2 = 12;

        int[] actual = cr.solution(p1, p2);
        int[] expected = new int[]{4, 5, 1, 2, 3};

        assertArrayEquals(expected, actual);
    }

}