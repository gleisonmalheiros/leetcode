package org.gleison.codility.lesson04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    MaxCounters mc;

    @BeforeEach
    void setUp() {
        mc = new MaxCounters();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solution1Test(int pN, int[] pA, int[] pExpected) {
        int[] actual = mc.solution1(pN, pA);
        Assertions.assertArrayEquals(pExpected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solution2Test(int pN, int[] pA, int[] pExpected) {
        int[] actual = mc.solution2(pN, pA);
        Assertions.assertArrayEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(5, new int[]{3, 4, 4, 6, 1, 4, 4}, new int[]{3, 2, 2, 4, 2}),
                Arguments.of(1, new int[]{1,1,2,3,1,1,1}, new int[]{5}),
                Arguments.of(0, new int[]{1,1,2,3,1,1,1}, new int[]{}),
                Arguments.of(3, new int[]{1,1,1,1,1,1,1,6}, new int[]{7,7,7}),
                Arguments.of(3, new int[]{6,1,1,1,1,1,1,1}, new int[]{7,0,0}),
                Arguments.of(3, new int[]{}, new int[]{0,0,0}),
                Arguments.of(3, new int [] {             2, 1, 2 }, new int [] {       1, 2, 0 } ),
                Arguments.of(3, new int [] {    2, 1, 2, 2, 1, 2 }, new int [] {       2, 4, 0 } ),
                Arguments.of(2, new int [] {          2, 1, 3, 2 }, new int [] {          1, 2 } ),
                Arguments.of(2, new int [] { 2, 1, 3, 2, 3, 1, 2 }, new int [] {          3, 3 } ),
                Arguments.of(1, new int [] {             2, 1, 2 }, new int [] {             1 } )
        );
    }

}