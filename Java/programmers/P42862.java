package Java.programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P42862 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/42862
     * Level 1. 체육복
     */

    public static int solution(int n, int[] lost, int[] reserve) {
        
        int count = 0; 
        //여벌 체육복을 가져온 학생이 도난 당했을 경우
        for (int i = 0; i < lost.length; i++) { 
            for (int j = 0; j < reserve.length; j++) { 
                if (lost[i] == reserve[j]) { 
                    lost[i] = reserve[j] = -1; 
                    count++; 
                    break; 
                } 
            } 
        } 

        for (int k : lost) { 
            for (int j = 0; j < reserve.length; j++) { 
                if (k == reserve[j] - 1 || k == reserve[j] + 1) { 
                    reserve[j] = -1; 
                    count++; 
                    break; 
                } 
            } 
        } 
            
        return n - lost.length + count; 
    }


    // 학생수 n만큼 int student[n] = {1};로 초기화 선언 answer = n;
    // 그중 lost를 돌며 해당 index에 -1 reserver는 +1
    // 값이 0일때, 좌우로 값이 2가 없는 경우는 answer-- 빌려준 학생 옷 -1

    public static int solution1(int n, int[] lost, int[] reserve) {
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
