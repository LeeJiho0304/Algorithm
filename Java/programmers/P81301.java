package Java.programmers;

public class P81301 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/81301
     * Level 1. 숫자 문자열과 영단어
     */

    public static int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++) {
            s = s.replace(str[i], String.valueOf(i));
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
    }
}
