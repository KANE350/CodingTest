import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int cneter =  (int)array.length/2+1;

        for(int i=0; i<cneter; i++){
            answer = array[i];
        }
        return answer;
    }
}