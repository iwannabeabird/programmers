import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] arr = {
				{1,2,3,4,5}, // supo1
				{2,1,2,3,2,4,2,5}, // supo2
				{3,3,1,1,2,2,4,4,5,5}}; // supo3
		
		Set<Integer> maxSet = new HashSet<>();
		int maxValue = 0;
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			int length = arr[i].length;
			for(int j=0; j<answers.length; j++) {
				if(arr[i][j%length] == answers[j]) {
					count++;
				}
			}
			if(count > maxValue) {
				maxSet.clear();
				maxSet.add(i+1);
				maxValue = count;
			} else if (count == maxValue) {
				maxSet.add(i+1);
			}
		}
		
        return maxSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
