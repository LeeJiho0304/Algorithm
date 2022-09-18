package Java.programmers;

public class P87389 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/87389
     * Level 1. 나머지가 1이 되는 수 찾기
     */

    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       System.out.println(solution(10));

    }
}
