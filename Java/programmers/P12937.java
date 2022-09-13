package Java.programmers;

public class P12937 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12937
     * Level 1. 짝수와 홀수
     */
    
    public static String solution(int num) {
        String answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
