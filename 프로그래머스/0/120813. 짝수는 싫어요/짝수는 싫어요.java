import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int[] test = new int[n];
        int count = 0;
        
				        for(int i=0; i<n; i++) {
				            if(i%2 == 0) {
				                test[i] = i+1;
				                System.out.println(test[i]);
				            }
				        }
				        
				        for (int i = 0; i < n; i++) {
				            if (test[i] != 0) {
				                count++;
				            }
				        }
				        
				        int[] answer = new int[count];
				        int index = 0;
				        
				        for(int i=0; i<n; i++) {
				            if(test[i] != 0) {
				                answer[index++] = test[i];
				            }
				        }


                        Arrays.sort(answer);
        return answer;
    }
}