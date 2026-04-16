import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=0; i<N; i++) {
        	int stage = i+1;
        	int total = 0;
        	int fail = 0;
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j] >= stage) {
        			total++;
        			if(stages[j] == stage)
        				fail++;
        		}
        	}
        	
        	map.put(i+1, (double) fail/total);
        	
        }
        
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
 
        int[] keys = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            keys[i] = list.get(i).getKey();
        }
        
        return keys;
    }
}
