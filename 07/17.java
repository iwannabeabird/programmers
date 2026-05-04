import java.util.*;

class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
    String answer = "";

    Queue<String> first = new ArrayDeque<>();
    for(String word : cards1) {
      first.add(word);
    }

    Queue<String> second = new ArrayDeque<>();
    for(String word : cards2) {
      second.add(word);
    }

    for(int i=0; i<goal.length; i++) {
      String targetStr = goal[i];

      if(targetStr.equals(first.peek())) {
        first.poll();
      } else if(targetStr.equals(second.peek())) {
        second.poll();
      } else {
        return "No";
      }
    }


    return "Yes";
  }
}
