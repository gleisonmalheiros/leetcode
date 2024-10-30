package org.gleison.hackerrank;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-dequeue/problem
 */

public class Dequeue {

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int uniqueSeqInt = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if (!deque.contains(num)) {
                deque.addLast(num);
                uniqueSeqInt = Math.max(uniqueSeqInt, deque.size());

                if (deque.size() == m) { // max subarray
                    System.out.println(uniqueSeqInt);
                    break;
                }
            } else { // if contains
                deque.addLast(num);

                // remove the elements until it doesn't
                while (!deque.isEmpty()) {
                    if (deque.getFirst() == num) {
                        deque.removeFirst();
                        break;
                    }
                    deque.removeFirst();
                }
            }

            if (i == n-1) { // the last number
                System.out.println(uniqueSeqInt);
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);

            map.put(num, map.getOrDefault(num, 0)+1);

            if(deque.size() == m){
                res = Math.max(res, map.size());
                int frontElement = deque.poll();
                map.put(frontElement, map.get(frontElement)-1);
                if(map.get(frontElement) == 0){
                    map.remove(frontElement);
                }
            }
        }

        System.out.println(res);
    }

}
