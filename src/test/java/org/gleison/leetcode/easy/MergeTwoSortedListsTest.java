package org.gleison.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class MergeTwoSortedListsTest {

    MergeTwoSortedLists mtsl;

    @BeforeEach
    void setUp() {
        mtsl = new MergeTwoSortedLists();
    }

    @Test
    void listNodeToArrayTest1() {
        // testing ListNode [1,2,4]
        MergeTwoSortedLists.ListNode ln3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode ln2 = new MergeTwoSortedLists.ListNode(2, ln3);
        MergeTwoSortedLists.ListNode ln1 = new MergeTwoSortedLists.ListNode(1, ln2); // head node

        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(ln1);
        var expected = new Integer[]{1,2,4};

        assertArrayEquals(expected, actual);
    }

    @Test
    void listNodeToArrayTest2() {
        // testing empty ListNode, should return []
        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(null);
        var expected = new Integer[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void listNodeToArrayTest3() {
        // testing ListNode [1]
        var ln1 = new MergeTwoSortedLists.ListNode(1); // head node
        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(ln1);
        var expected = new Integer[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void listNodeToArrayTest4() {
        // testing ListNode [], as the "val" attribute in ListNode is a primitive, then default 0
        var ln1 = new MergeTwoSortedLists.ListNode(); // head node
        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(ln1);
        var expected = new Integer[]{0};
        assertArrayEquals(expected, actual);
    }


    @Test
    void mergeTwoListsTest1() {
        // merging two null ListNode
        MergeTwoSortedLists.ListNode actual = mtsl.mergeTwoLists(null, null);
        assertNull(actual);
    }

    @Test
    void mergeTwoListsTest2() {
        // testing the merge when one ListNode is null
        MergeTwoSortedLists.ListNode ln = new MergeTwoSortedLists.ListNode(1);
        var expected = new Integer[]{1};

        // merging when the *first* parameter is null
        MergeTwoSortedLists.ListNode firstNull = mtsl.mergeTwoLists(null, ln);
        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(firstNull);
        assertArrayEquals(expected, actual);

        // merging when *second* parameter is null
        MergeTwoSortedLists.ListNode secondNull = mtsl.mergeTwoLists(ln, null);
        actual = MergeTwoSortedLists.ListNode.listNodeToArray(secondNull);
        assertArrayEquals(expected, actual); // same expectation here
    }

    @Test
    void mergeTwoListsTest3() {
        // creating [1,2,4]
        MergeTwoSortedLists.ListNode ln3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode ln2 = new MergeTwoSortedLists.ListNode(2, ln3);
        MergeTwoSortedLists.ListNode ln1 = new MergeTwoSortedLists.ListNode(1, ln2);

        // creating [1,3,4]
        MergeTwoSortedLists.ListNode zln3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode zln2 = new MergeTwoSortedLists.ListNode(3, zln3);
        MergeTwoSortedLists.ListNode zln1 = new MergeTwoSortedLists.ListNode(1, zln2);

        MergeTwoSortedLists.ListNode mergedLn = mtsl.mergeTwoLists(ln1, zln1);

        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(mergedLn);
        var expected = new Integer[]{1,1,2,3,4,4};

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeTwoListsTest4() {
        // merging uneven size of ListNode

        // creating [1,2]
        MergeTwoSortedLists.ListNode ln2 = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode ln1 = new MergeTwoSortedLists.ListNode(1, ln2);

        // creating [1,3,4]
        MergeTwoSortedLists.ListNode zln3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode zln2 = new MergeTwoSortedLists.ListNode(3, zln3);
        MergeTwoSortedLists.ListNode zln1 = new MergeTwoSortedLists.ListNode(1, zln2);

        MergeTwoSortedLists.ListNode mergedLn = mtsl.mergeTwoLists(ln1, zln1);

        var actual = MergeTwoSortedLists.ListNode.listNodeToArray(mergedLn);
        var expected = new Integer[]{1,1,2,3,4};

        assertArrayEquals(expected, actual);
    }

}