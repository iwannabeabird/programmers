package test;

import java.util.*;


public class TestClass {
	public static void main(String[] args) {
		System.out.println(String.valueOf( solution("}}}") ));
	}
	
	public static int solution(String str) {
        int successCount = 0;
        
        Set<String> pushSet = new HashSet<>(Arrays.asList("[", "{", "("));
        Map<String, String> popMap = new HashMap<>() {
        	{
        		put("]", "[");
        		put("}", "{");
        		put(")", "(");
        	};
        };
        
        int length = str.length();
        String[] arr = str.split("");
        
        Deque<String> dequeStr = new ArrayDeque<>();
        for(String s : arr) {
        	dequeStr.addLast(s); // 추가
        }
        
        for(int i=0; i < length; i++) {
        	Stack<String> stack = new Stack<>();
        	String firstValue = dequeStr.peek();
        	int couple = 0;
        	for(String c : dequeStr) {
        		if(pushSet.contains(c)) {
        			couple++;
        			stack.push(c);
        		} else {
        			couple--;
        			if(!stack.isEmpty() && stack.peek().equals(popMap.get(c))) {
        				stack.pop();
        			}
        		}
        	}
        	if(stack.isEmpty() && couple == 0) {
        		successCount ++;
        	}
        	dequeStr.removeFirst();
        	dequeStr.addLast(firstValue);
        }
        
        return successCount;
    }
}
