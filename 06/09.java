package test;

import java.util.*;


public class TestClass {
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
	
	static String solution(int number) {
		StringBuffer sb = new StringBuffer();
		Stack<Integer> stack = new Stack<>();
		int n = number;
		for(;;) {
			int nm = n%2;
			stack.push(nm);
			
			n /= 2;
			if(n == 1) {
				stack.push(n);
				break;
			}
		}
		
		for(;;) {
			if(stack.isEmpty()) {
				break;
			}
			
			Integer s = stack.pop();
			sb.append(s);
		}
		
		return sb.toString();
	}
}
