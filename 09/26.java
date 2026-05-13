package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(16, 9, 12)); // 반례 https://school.programmers.co.kr/questions/28057
        System.out.println(solution(8, 4, 7));
        System.out.println(solution(8, 4, 5));
        System.out.println(solution(8, 2, 3));
    }


    public static int solution(int n, int a, int b) {
        if (a<b) {
            return solve(n, a, b);
        }

        return solve(n, b, a);

    }

    public static int solve(int n, int small, int big) {
        int answer = 1;

        while (true) {
            if ((big%2 == 0) && (small%2==1) && (big-small == 1)) {
                break;
            }
            small = (small % 2 == 1) ? (small + 1) / 2 : small / 2;
            big = (big % 2 == 1) ? (big + 1) / 2 : big / 2;

            answer++;
        }

        return answer;
    }

}
