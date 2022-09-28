import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        
        Arrays.sort(strArr);   
        
        StringBuilder sb = new StringBuilder();
        for(int i = strArr.length-1; i >= 0; i--) {
            sb.append(strArr[i]);
        }

        return sb.toString();
    }
}

