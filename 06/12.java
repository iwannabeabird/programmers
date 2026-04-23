package test;

import java.util.*;


public class TestClass {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,2,3}));
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
        	int count = 0;
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[j] >= prices[i]) {
        			count++;
        		} else {
        			break;
        		}	
        	}
        	answer[i] = count;
        }
          
        return answer;
    }
}
