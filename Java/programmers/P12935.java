package Java.programmers;

import java.util.Arrays;

public class P12935 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12935
     * Level 1. 제일 작은 수 제거하기
     * 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열 리턴
     */

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length <= 1) {
            answer = new int[]{-1};
        }
        
        int min = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        
        for(int i = 0; i < arr.length-1; i++) {
            if(i < index)
                answer[i] = arr[i];
            else {
                answer[i] = arr[i+1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        for(int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
