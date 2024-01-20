package org.gleison.codility.lesson04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MissingIntegerTest {

    MissingInteger mi;

    @BeforeEach
    void setUp() {
        mi = new MissingInteger();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solution1Test(int[] pA, int pExpected) {
        int actual = mi.solution1(pA);
        Assertions.assertEquals(pExpected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solution2Test(int[] pA, int pExpected) {
        int actual = mi.solution2(pA);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5 ),
                Arguments.of(new int[]{1, 2, 3}, 4 ),
                Arguments.of(new int[]{-1, -3}, 1 ),
                Arguments.of(new int[]{}, 1 ),
                Arguments.of(new int[]{-1, 0, 1, 3}, 2 ),
                Arguments.of(new int[]{-2, -1, 0}, 1 )
        );
    }

}