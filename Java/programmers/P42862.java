package Java.programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P42862 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/42862
     * Level 1. 체육복
     */

    // public static int solution(int n, int[] lost, int[] reserve) {
    //     int answer = n - lost.length; // 수업 들을 수 있는 학생 수
    //     int[] lostCheck = new int[lost.length];
    //     Arrays.sort(lost);
    //     Arrays.sort(reserve);
    //     int cnt = 0;
    //     for(int i = 0; i < reserve.length; i++) {
    //         for(int j = 0; j < lost.length; j++) {
    //             if(answer > n) break;
    //             else if(reserve[i]-1 == lost[j] || reserve[i]+1 == lost[j]) {
    //                 lostCheck[cnt++] = lost[j];
    //                 for(int k = 0; k < cnt; k++) {
    //                     if(lostCheck[k] == lost[j]) break;
    //                     else answer++;
    //                 }
                    
    //             }

    //         }
    //     }

    //     // int r = reserve.length;
    //     // int l = lost.length;
    //     // int a = 0;
    //     // if(r -l >=0){
    //     //     a = n;
    //     // }
    //     // else if(lost.length>reserve.length){
    //     //     a = n-(lost.length-reserve.length); 
    //     // }
    //     return answer;
    // }


    // 학생수 n만큼 int student[n] = {1};로 초기화 선언 answer = n;
    // 그중 lost를 돌며 해당 index에 -1 reserver는 +1
    // 값이 0일때, 좌우로 값이 2가 없는 경우는 answer-- 빌려준 학생 옷 -1

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int []student = new int[n];
        
        for(int i : student) {
            student[i] = 1;
        }
        //Arrays.fill(student, 1);
        
        for (int i : lost)
            student[i - 1] -= 1;
        for (int i : reserve)
            student[i - 1] += 1;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) //왼쪽 검사
                    student[i - 1] -= 1;
                else if (i < n - 1 && student[i + 1] == 2)
                    student[i + 1] -= 1;
                else
                    answer--;
            }
        }
        return answer;
    }

    
    public static void main(String[] args) {
        //
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n, lost, reserve));
    }
}
