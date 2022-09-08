package Java.programmers;
import java.util.Arrays;

public class P12938 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12938
     * Level 3. 최고의 집합
     */

    public static int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if(s < 2 || n > s) return new int[] {-1};
        
        int cnt = 0;
        
        for(int i = n; i > 0; i--) {
            answer[cnt] = s / i;
            s -= answer[cnt];
            cnt++;
        }
        
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {

        for(int i : solution(2, 9)) {
            System.out.println(i);
        }
       
    }
}
