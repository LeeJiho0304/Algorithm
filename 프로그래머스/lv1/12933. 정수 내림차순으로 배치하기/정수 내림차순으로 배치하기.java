import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        Integer[] arr = new Integer[str.length()];
        
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            arr[i] = charArr[i] - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        String strNum = "";
        
        for(int i = 0; i < charArr.length; i++) {
            strNum += arr[i];
        }

        return Long.parseLong(strNum);
    }
}


