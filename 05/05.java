class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
                int arr1GaroLength = arr1.length; // 3
        //int arr1SeroLength = arr1[0].length; // 2
        int arr2GaroLength = arr2.length; // 2
        int arr2SeroLength = arr2[0].length; // 2
        
        int[][] answer = new int[arr1GaroLength][arr2SeroLength];
        
        for(int i=0; i<arr1GaroLength; i++) {
        	for(int j=0; j<arr2SeroLength; j++) {
        		int sum = 0;
        		for(int k=0; k<arr2GaroLength; k++) {
        			//System.out.println( "[" +  i + "][" + k + "] [" + k + "][" + j + "]");
        			sum += (arr1[i][k] * arr2[k][j]);
        		}
        		answer[i][j] = sum;
        	}
        	
        }
        
        return answer;
    }
}
