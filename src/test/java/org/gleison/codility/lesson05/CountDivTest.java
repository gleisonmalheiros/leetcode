package org.gleison.codility.lesson05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class CountDivTest {

    CountDiv cd;

    @BeforeEach
    void setUp() {
        cd = new CountDiv();
    }

    @ParameterizedTest
    @CsvSource({"6,11,2,3"}) // base test
    public void solutionTest1(int pA, int pB, int pK, int pExpected) {
        int actual = cd.solution(pA, pB, pK);
        Assertions.assertEquals(pExpected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest2(int pA, int pB, int pK, int pExpected) {
        int actual = cd.solution(pA, pB, pK);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(  5, 11, 2,  3 ),
                Arguments.of(  0, 11, 5,  3 ),
                Arguments.of(  0, 11, 12, 1 ), //K>B, A==0
                Arguments.of(  1, 11, 12, 0 ), //K>B, A>0
                Arguments.of(  0, 0,  12, 1 ), //K>B, A==0, B==0
                Arguments.of( 11, 33, 3, 8 ),

                Arguments.of( 10, 10,  5, 1 ), //A = 10, B = 10, K in {5,7,20}
                Arguments.of( 10, 10,  7, 0 ), //A = 10, B = 10, K in {5,7,20}
                Arguments.of( 10, 10, 20, 0 ), //A = 10, B = 10, K in {5,7,20}

                Arguments.of( 33, 33, 33, 1 ), //A == B
                Arguments.of( 100000, 1000000, 1000, 901 ),
                Arguments.of( 1000, 10000, 10, 901 ),
                Arguments.of( 100, 1000, 1, 901 ),
                Arguments.of( 0, 2000000000, 2000000000, 2 ), //max B
                Arguments.of( 2000000000, 2000000000, 2000000000, 1 ), //max A, B
                Arguments.of( 100, 123000000, 2, 61499951 ), //A = 100, B=123M+, K=2
                Arguments.of( 101, 123000000, 10000, 12300 ) //A = 101, B = 123M+, K = 10K
        );
    }

}