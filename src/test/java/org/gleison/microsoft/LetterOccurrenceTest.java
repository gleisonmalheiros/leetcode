package org.gleison.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LetterOccurrenceTest {

    LetterOccurrence ph;

    @BeforeEach
    void setUp() {
        ph = new LetterOccurrence();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void solutionTest(String pLetters, int pExpected) {
        int actual = ph.solution(pLetters);
        Assertions.assertEquals(pExpected, actual);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("aaAbcCABBc", 2),
                Arguments.of("xyzXYZabcABC", 6),
                Arguments.of("ABCabcAefG", 0)
        );
    }

}