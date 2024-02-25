package org.gleison.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class PotHoleTest {

    PotHole ph;

    @BeforeEach
    void setUp() {
        ph = new PotHole();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest(String pS, int pB, int pExpected) {
        int actual = ph.solution(pS, pB);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("...xxx..x....xxx.", 7, 5),
                Arguments.of("..xxxxx", 4, 3),
                Arguments.of("x.x.xxx...x", 14, 6),
                Arguments.of("..", 5, 0)
        );
    }

}