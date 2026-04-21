import java.util.Stack;

class Solution
{
    public int solution(String str)
    {
        String[] arr = str.split("");
        Stack<String> stack = new Stack();

    	for(String s : arr) {
        	if(!stack.isEmpty() && s.equals(stack.peek())) {
        		stack.pop();
        	} else {
        		stack.push(s);
        	}
        }         
        return stack.isEmpty() ? 1 : 0;
    }
}
