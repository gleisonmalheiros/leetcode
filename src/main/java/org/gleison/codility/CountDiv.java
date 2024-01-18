/**

 https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/

 Write a function:
 class Solution { public int solution(int A, int B, int K); }

 that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 { i : A ≤ i ≤ B, i mod K = 0 }

 For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

 Write an efficient algorithm for the following assumptions:

 A and B are integers within the range [0..2,000,000,000];
 K is an integer within the range [1..2,000,000,000];
 A ≤ B.

 https://funnelgarden.com/countdiv-codility-solution/
 */

package org.gleison.codility;

import java.util.Set;
import java.util.HashSet;

public class CountDiv {

    public int solution(int A, int B, int K) {

        if (K > B) { // above the upper boundary
            return 0;
        }
        if (K > (B / 2 + A)) { // if K bigger than the middle of the range
            return 1;
        }
        /*if (K > A) { // don't need to test anything below K if K is between A and B
            A = K;
        }*/

        int tot = (B-1) / K;
        int par = (A-1) / K;
        return tot - par;

        /*// find the first number divisible
        int firstDiv = 0;
        for (int i = A; i < B; i++) {
            if (i % K == 0) {
                firstDiv = i;
                break;
            }
        }

        // after that just count the frequency of these numbers
        int count = 0;
        for (int i = firstDiv; i < B; i = i + K) {
            count++;
        }

        return count;*/
    }

}
