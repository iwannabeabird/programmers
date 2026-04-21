package test;

import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4}));
	}
	
	public static int solution(int[][] board, int[] moves) {
        Map<Integer, Stack> map = new HashMap<>();
       
        int length = board.length;
        for(int i=0; i<length; i++) { // 열별(줄)로 담음
        	Stack<Integer> stack = new Stack<>();
	        for(int j = length-1; j > 0; j--) {
	        	if(board[j][i] == 0) {
	        		break;
	        	}
	        	stack.push(board[j][i]);
	        }
	        map.put(i+1, stack);
        }
        
        Stack<Integer> stack = new Stack<>(); 
        int count = 0;
        for(int i=0; i<moves.length; i++) {
        	Stack<Integer> line = (Stack<Integer>) map.get(moves[i]);
			if(line.isEmpty()) {
				continue;
			}

			if(!stack.isEmpty() &&stack.peek().equals(line.peek())) {
				line.pop();
				stack.pop();
				count = count+2;
	        } else {
	        	stack.push(line.pop());
	        }
        }
        
        System.out.println(stack);
        return count;
    }
}
