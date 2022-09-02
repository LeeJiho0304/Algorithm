package Java.programmers;

public class P12931 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/12931
     * 자릿수 더하기
     */

    public static int solution(int n) {
        int answer = 0;
    
        String[] strNum = (String.valueOf(n)).split("");
        for(int i = 0; i < strNum.length; i++) {
            answer += Integer.parseInt(strNum[i]);
        }
    
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
    
        while(n != 0) {
            answer += n % 10;
            n = n / 10;
        }
    
        return answer;
    }
    

    public static void main(String[] args) {
        System.out.println(solution(987));
        System.out.println(solution2(987));
    }
    
}
