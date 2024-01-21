package org.gleison.codility.lesson05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class MinAvgTwoSliceTest {

    MinAvgTwoSlice pc;

    @BeforeEach
    void setUp() {
        pc = new MinAvgTwoSlice();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest2(int[] pA, int pExpected) {
        int actual = pc.solution(pA);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{4,2,2,5,1,5,8}, 1),
                Arguments.of(new int[]{1,2}, 0),
                Arguments.of(new int[]{1,2,3}, 0)
        );
    }

}