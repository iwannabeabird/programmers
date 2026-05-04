import java.util.HashMap;
import java.util.Map;

class Solution {
  public static String solution(String[] participant, String[] completion) {
    Map<String, Integer> pMap = new HashMap<>();

    for (String p : participant) {
      if (pMap.containsKey(p)) {
        pMap.put(p, pMap.get(p) + 1);
      } else {
        pMap.put(p, 1);
      }
    }
    //System.out.println(pMap);

    for (String c : completion) {
      if (pMap.get(c) != 0) {
        pMap.put(c, pMap.get(c) - 1);
      }
    }

    for (String pm : pMap.keySet()) {
      if (pMap.get(pm) != 0) {
        return pm;
      }
    }
    return null;
  }
}
