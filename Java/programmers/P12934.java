package Java.programmers;

public class P12934 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12934
     * Level 1. 정수 제곱근 판별 
     */

    public static long solution(long n) {
        long answer = 0;
        for(long i = 1; i * i <= n; i++) {
            if(i * i == n) {
                answer = (i+1)*(i+1);
            } else {
                answer = -1;
            }
        }
        return answer; 
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
