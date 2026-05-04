import java.util.*;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
    int length = progresses.length;
    int[] arr = new int[length];
    for(int i=0; i<length; i++) {
      arr[i] = (int) Math.ceil((double)(100 - progresses[i])/(double)speeds[i]);
    }

    List<Integer> list = new ArrayList<>();
    Queue<Integer> queue = new ArrayDeque<>();

    for(int j=0; j<length; j++) {
      if( !queue.isEmpty() && arr[j] > queue.peek()) {
          list.add(queue.size());
          queue.clear();

      }
      queue.add(arr[j]);
    }
    list.add(queue.size());

    int[] result = new int[list.size()];
    for(int k = 0; k<list.size(); k++) {
      result[k] = list.get(k);
    }
    return result;
  }
}
