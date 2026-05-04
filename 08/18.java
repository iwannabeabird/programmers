import java.util.*;

class Main {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {1,2,3,4,8}, 6));
    System.out.println(solution(new int[] {2,3,5,9}, 10));
  }

  public static boolean solution(int[] arr, int target) {
    boolean answer = false;

    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i] + arr[j] == target) {
          return true;
        }
      }
    }


    return false;
  }
}
