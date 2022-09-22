package Java.programmers;

public class P76501 {

    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/76501
     * Level 1. 음양 더하기
     */
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            int num = signs[i]?absolutes[i]:-absolutes[i];
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        
        System.out.println(solution(absolutes, signs));
    }
}
