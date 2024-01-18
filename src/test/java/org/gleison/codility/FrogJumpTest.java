package org.gleison.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class FrogJumpTest {

    FrogJump fj;

    @BeforeEach
    void setUp() {
        fj = new FrogJump();
    }

    @Test
    void solutionTest1() {
        int actual = fj.solution(10, 85, 30);
        int expected = 3;
        assertEquals(expected, actual);
    }
}