import java.util.*;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> pigoMap = new HashMap<>();
        
        Set<String> uniqueReportSet = new HashSet<>();
        Set<String> realSet = new HashSet<>();
        
        // k번 이상 신고된 사람을 찾는다.
        for(String str : report) {
        	// 중복 신고
        	if(uniqueReportSet.contains(str)) {
        		continue;
        	}
       
        	uniqueReportSet.add(str);
        	
        	String pigo = str.split(" ")[1];
        	pigoMap.put(pigo, pigoMap.getOrDefault(pigo, 0)  + 1);
        	
        	// k번 이상 신고
        	if(pigoMap.get(pigo) >= k) {
        		realSet.add(pigo);
        	}
        }
        
        Map<String, Integer> resultMap = new HashMap<>();
        // value가 신고대상인 사람의 count+1
        for(String str : uniqueReportSet) {
        	String toMail = str.split(" ")[0];
        	String pigo = str.split(" ")[1];
        	if(realSet.contains(pigo)) {
        		resultMap.put(toMail, resultMap.getOrDefault(toMail, 0) + 1);
        	}
        }
        
        int[] resultArr = new int[id_list.length];
        for(int i=0; i < id_list.length; i++) {
        	resultArr[i] = resultMap.getOrDefault(id_list[i], 0);
        }
        
        for(int j: resultArr) {
        	System.out.println( j);
        }

        return resultArr;
	}
}
