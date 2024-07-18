class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;
       
        answer = (n+pizza-1)/pizza;
       
        return answer;
    }
}