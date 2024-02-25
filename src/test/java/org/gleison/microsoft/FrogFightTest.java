package org.gleison.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FrogFightTest {

    FrogFight pc;

    @BeforeEach
    void setUp() {
        pc = new FrogFight();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest2(int[] pA, int pExpected) {
        int actual = pc.solution(pA);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{2,6,8,5}, 3),
                Arguments.of(new int[]{1,5,5,2,6}, 4),
                Arguments.of(new int[]{1,5,5,5,5}, 5),
                Arguments.of(new int[]{6,5,5,5,1}, 5),
                Arguments.of(new int[]{1,5,5,5,1}, 4),
                Arguments.of(new int[]{5,3,1,3,5}, 5)
        );
    }

}