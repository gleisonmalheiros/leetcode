/**

 https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

 Write a function:
 class Solution { public int solution(int[] A); }

 that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

 For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

 Given A = [1, 2, 3], the function should return 4.

 Given A = [−1, −3], the function should return 1.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

package org.gleison.codility.lesson04;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {

    public int solution1(int[] A) {
        Arrays.sort(A);

        int missing = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1) { // ignore anything below 1

                if (A[i] == missing) { // found the missing min integer
                    missing++; // check the next one
                } else if (A[i] > missing) { // current value is bigger than missing
                    return missing;
                }
            }
        }

        return missing;
    }

    public int solution2(int[] A) {
        Set<Integer> set = new TreeSet<Integer>();

        for (int j : A) {
            if (j > 0) { // only 1 or above, ignore the rest
                set.add(j);
            }
        }

        int missing = 1;
        for (int i : set) {
            if (i == missing) { // found the missing min integer
                missing++; // check the next one
            } else if (i > missing) { // current value is bigger than missing
                return missing;
            }
        }

        return missing;
    }

}
