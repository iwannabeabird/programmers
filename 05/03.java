import java.util.*;

class Solution {    
    int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<Integer>();
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				sumSet.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] result = sumSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);
		return result;
    }
}
