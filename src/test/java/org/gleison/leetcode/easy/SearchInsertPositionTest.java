package org.gleison.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    SearchInsertPosition sip;

    @BeforeEach
    void setUp() {
        sip = new SearchInsertPosition();
    }

    @Test
    void searchInsert() {
        assertEquals(2, sip.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, sip.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, sip.searchInsert(new int[]{1,3,5,6}, 7));
        assertEquals(0, sip.searchInsert(new int[]{1,3,5,6}, 0));
    }
}