import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        while(n != 0) {
            answer += n % 10;
            n = n / 10;
        }

        /*
        String[] strNum = (String.valueOf(n)).split("");
        for(int i = 0; i < strNum.length; i++) {
            answer += Integer.parseInt(strNum[i]);
        }*/

        return answer;
    }
}