package org.gleison.google.foobar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class BrailleTranslationTest {

    @Test
    void indexOfTest1() {
        String s = "Braille";

        String actual = BrailleTranslation.solution(s);
        String expected = "000001110000111010100000010100111000111000100010";

        assertEquals(expected, actual);
    }

    @Test
    void indexOfTest2() {
        String s = "The quick brown fox jumps over the lazy dog";

        String actual = BrailleTranslation.solution(s);
        String expected = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";

        assertEquals(expected, actual);
    }

    @Test
    void indexOfTest3() {
        String s = "code";

        String actual = BrailleTranslation.solution(s);
        String expected = "100100101010100110100010";

        assertEquals(expected, actual);
    }

}