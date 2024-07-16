class Solution {
    public int[] solution(int[] num_list) {
        
     int even = 0;
     int oddNumber = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==1) {
                even++;
            }else {
                oddNumber++;
            }
        }
		int answer[] = {oddNumber, even};
        
        return answer;
    }
}