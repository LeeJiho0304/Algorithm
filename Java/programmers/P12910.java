package Java.programmers;

import java.util.Arrays;

public class P12910 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12910
     * Level 1. 나누어 떨어지는 숫자 배열
     */
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int cnt = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }

        if(cnt == 0) return answer;
        if(cnt >= 1) {
            answer = new int[cnt];
        }

    
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        for(int i : solution(arr, 5)) {
            System.out.println(i);
        }

    }
}
