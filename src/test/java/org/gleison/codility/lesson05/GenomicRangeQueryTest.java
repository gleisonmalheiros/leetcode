package org.gleison.codility.lesson05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class GenomicRangeQueryTest {

    GenomicRangeQuery pc;

    @BeforeEach
    void setUp() {
        pc = new GenomicRangeQuery();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest(String pS, int[] pP, int[] pQ, int[] pExpected) {
        int[] actual = pc.solution(pS, pP, pQ);
        Assertions.assertArrayEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[]{2, 4, 1}),
                Arguments.of("CCCCCCC", new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[]{2, 2, 2}),
                Arguments.of("AT", new int[]{0, 0, 1}, new int[]{0, 1, 1}, new int[]{1, 1, 4})
        );
    }

}