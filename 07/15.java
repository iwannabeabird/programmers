package test;

import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		System.out.println(solution(5, 2));
	}
	
	public static int solution(int n, int k) { // N: 총 인원, K: 임의의 숫자
        // 1 ~ N까지 담음
		Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
        	queue.add(i+1);
        }
        
        int count = 0;
        while(queue.size() > 1) {
        	if(count == (k-1)) { // k번째 제외
        		queue.poll();
        		count = 0;
        	} else { // 아니면 뒤에 다시 넣음
        		queue.add(queue.poll());
        		count++;
        	}
        }
        
        
        return queue.poll();
    }
}
