package org.gleison.codility.lesson01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class BinaryGapTest {

    BinaryGap bg;

    @BeforeEach
    void setUp() {
        bg = new BinaryGap();
    }

    @ParameterizedTest
    @CsvSource({
            "9,2", // 1001
            "529,4", // 1000010001
            "20,1", // 10100
            "15,0", // 1111
            "32,0", // 100000
            "1041,5" // 10000010001
    })
    public void solutionTest1(int pN, int pExpected) {
        int actual = bg.solution(pN);
        assertEquals(pExpected, actual);
    }

}