package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class ValidParenthesesTest {

    ValidParentheses valPar;

    @BeforeEach
    void setUp() {
        valPar = new ValidParentheses();
    }

    @Test
    void isValid1() {
        var actual = valPar.isValid("()");
        var expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid2() {
        var actual = valPar.isValid("()[]{}");
        var expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid3() {
        var actual = valPar.isValid("[(()[]{})]");
        var expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid4() {
        var actual = valPar.isValid("(]");
        var expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid5() {
        var actual = valPar.isValid("]");
        var expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid6() {
        var actual = valPar.isValid("{)");
        var expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid7() {
        var actual = valPar.isValid("(}");
        var expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid8() {
        var actual = valPar.isValid("(A");
        var expected = false;
        assertEquals(expected, actual);
    }

}