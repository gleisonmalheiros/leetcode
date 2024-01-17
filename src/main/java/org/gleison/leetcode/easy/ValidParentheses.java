package org.gleison.leetcode.easy;

import java.util.LinkedList;

/**
 * #20
 * https://leetcode.com/problems/valid-parentheses/

 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {

    public boolean isValid(String s) {
        LinkedList<Character> llist = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) == '(') ||
                    (s.charAt(i) == '{') ||
                    (s.charAt(i) == '[')) {
                llist.addFirst(s.charAt(i));
            } else if (llist.isEmpty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                if (llist.getFirst() == '(') {
                    llist.removeFirst();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (llist.getFirst() == '{') {
                    llist.removeFirst();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (llist.getFirst() == '[') {
                    llist.removeFirst();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return llist.isEmpty();
    }

}
