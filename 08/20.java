package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));

        System.out.println(solution(new String[]{"apple"}, new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String,Integer> wantMap = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int checkCount = discount.length - 10 + 1; //
        for (int j=0; j<checkCount; j++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for(int k=0; k<10; k++) {
                String prd = discount[k+j];
                if(discountMap.containsKey(prd)) {
                    discountMap.put(prd, discountMap.get(prd) + 1);
                } else {
                    discountMap.put(prd, 1);
                }
            }
            if(discountMap.equals(wantMap)) {
                answer++;
            }
        }

        return answer;
    }
}
