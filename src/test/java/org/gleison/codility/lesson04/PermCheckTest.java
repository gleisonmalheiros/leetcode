package org.gleison.codility.lesson04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    PermCheck pc;

    @BeforeEach
    void setUp() {
        pc = new PermCheck();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest(int[] pA, int pExpected) {
        int actual = pc.solution(pA);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8}, 0 ),
                Arguments.of(new int[]{4, 1, 3, 2}, 1 ),
                Arguments.of(new int[]{4, 1, 3}, 0 ),
                Arguments.of(new int[]{4, 1, 3, 2, 3}, 0 ),
                Arguments.of(new int[]{-1,-2,-3}, 0 )
        );
    }

}