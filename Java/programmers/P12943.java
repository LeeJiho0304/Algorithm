package Java.programmers;

public class P12943 {
    public static int solution(int num) {
        long n = num;
        int answer = 0;

        if(num == 1) return 0;
        
        while(n != 1) {
            if(answer > 500) return -1;
            if(n % 2 == 0) {
                n = n / 2;
                answer++;
            } else if(n % 2 == 1){
                n = n * 3 + 1;
                answer++;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
