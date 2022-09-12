package Java.programmers;
import java.util.Arrays;

public class P42576 {
    public static String solution(String[] participant, String[] completion) {
        /*
         * https://school.programmers.co.kr/learn/courses/30/lessons/42576
         * Level 1. 완주하지 못한 선수
         */

        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i = 0; i < completion.length; i++) {
            if(!completion[i].equals(participant[i])) {
                return participant[i];
            }
        } 
        return participant[i];
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }
}
