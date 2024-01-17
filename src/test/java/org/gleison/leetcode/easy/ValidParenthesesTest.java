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
        Boolean actual = valPar.isValid("()");
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid2() {
        Boolean actual = valPar.isValid("()[]{}");
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid3() {
        Boolean actual = valPar.isValid("[(()[]{})]");
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isValid4() {
        Boolean actual = valPar.isValid("(]");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid5() {
        Boolean actual = valPar.isValid("]");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid6() {
        Boolean actual = valPar.isValid("{)");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid7() {
        Boolean actual = valPar.isValid("(}");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isValid8() {
        Boolean actual = valPar.isValid("(A");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

}