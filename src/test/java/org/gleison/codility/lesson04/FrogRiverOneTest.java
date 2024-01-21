package org.gleison.codility.lesson04;

import org.gleison.codility.lesson05.CountDiv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class FrogRiverOneTest {

    FrogRiverOne fro;

    @BeforeEach
    void setUp() {
        fro = new FrogRiverOne();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest(int pX, int[] pA, int pExpected) {
        int actual = fro.solution(pX, pA);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(5, new int[]{1,3,1,4,2,3,5,4}, 6 ),
                Arguments.of(4, new int[]{1,2,3}, -1 ),
                Arguments.of(2, new int[]{2,3,1,2}, 2 ),
                Arguments.of(9, new int[]{1,2,3,5,6,7,8,1,2,3,5,6,7,8,9,1,3,2,5,6,7,9,5,3,2,1,5,6,8,9,9,9,9}, -1 ), // missing #4
                Arguments.of(9, new int[]{1,2,3,5,6,7,8,1,2,3,5,6,7,8,9,1,3,2,5,6,7,9,5,3,2,1,5,6,8,9,9,9,9,4}, 33 ), // added #4 at the end
                Arguments.of(1, new int[]{1}, 0 ),
                Arguments.of(1, new int[]{}, -1 ),
                Arguments.of(3, new int[]{1, 3, 1, 3, 2, 1, 3}, 4 )
        );
    }

}