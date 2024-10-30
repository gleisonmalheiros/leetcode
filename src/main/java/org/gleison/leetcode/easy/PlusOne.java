package org.gleison.leetcode.easy;

import java.util.Arrays;

/**
 * #66
 * https://leetcode.com/problems/plus-one/description/
 *

 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order.
 The large integer does not contain any leading 0's.

 Increment the large integer by one and return the resulting array of digits.

 Example 1:

 Input: digits = [1,2,3]
 Output: [1,2,4]
 Explanation: The array represents the integer 123.
 Incrementing by one gives 123 + 1 = 124.
 Thus, the result should be [1,2,4].

 Example 2:

 Input: digits = [4,3,2,1]
 Output: [4,3,2,2]
 Explanation: The array represents the integer 4321.
 Incrementing by one gives 4321 + 1 = 4322.
 Thus, the result should be [4,3,2,2].

 Example 3:

 Input: digits = [9]
 Output: [1,0]
 Explanation: The array represents the integer 9.
 Incrementing by one gives 9 + 1 = 10.
 Thus, the result should be [1,0].

 Constraints:

 1 <= digits.length <= 100
 0 <= digits[i] <= 9
 digits does not contain any leading 0's.

 *
 */

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        System.arraycopy( digits, 0, res, 0, digits.length );

        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] == 9) {
                res[i] = 0;
            } else {
                res[i] = res[i] + 1;
                break;
            }
        }

        // corner case for just 9s
        if (res[0] == 0) {
            int[] res2 = new int[res.length + 1];
            System.arraycopy( res, 0, res2, 1, res.length );
            res2[0] = 1;
            return res2;
        }

        return res;
    }

}
