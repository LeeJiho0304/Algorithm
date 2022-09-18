package Java.programmers;

import java.util.Arrays;
import java.util.Collections;

public class P12933 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        //long answer = 0;
        String str = String.valueOf(n);
        char[] charArr = str.toCharArray();
        // Arrays.sort(arr, Collections.reverseOrder());
        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i < charArr.length; i++) {
            arr[i] = charArr[i] - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());

        String strNum = "";
        for(int i = 0; i < charArr.length; i++) {
            strNum += arr[i];
        }
        
        long answer = Long.parseLong(strNum);
        return answer;
    }
}
