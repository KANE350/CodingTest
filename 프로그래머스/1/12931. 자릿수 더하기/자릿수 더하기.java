import java.util.*;

public class Solution {
    public int solution(int n) {
  
        String strNum = Integer.toString(n);
        int answer = 0;
        
        for(int i=0; i<strNum.length(); i++){
                            answer += Character.getNumericValue((strNum.charAt(i)));
                    }

        
       
        
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        System.out.println(answer);
        return answer;
    }
}