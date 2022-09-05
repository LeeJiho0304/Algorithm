package Java.programmers;
import java.util.Arrays;

public class P42576 {
    public static String solution(String[] participant, String[] completion) {
        /*
         * 
         */
        String answer = "";
        
        for(int i = 0; i < completion.length; i++) {
            for(int j = 0; j < participant.length; j++) {
                if(participant[j]!=null && participant[j].equals(completion[i])) {
                    participant[j] = null;
                    completion[i] = null;
                }
            }
        } 
        for(int i = 0; i < participant.length; i++) {
            if(participant[i] != null) {
                answer = participant[i];
            }
        }

        // Arrays.sort(participant);
        // Arrays.sort(completion);
        
        // for(int i = 0; i < completion.length; i++) {
        //     for(int j = 0; j < participant.length; j++) {
        //         if(!completion[i].equals(participant[i]))
        //             answer = participant[i];
        //     }
        // } 
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
        // System.out.println(null.equals("hi"));
    }
}
