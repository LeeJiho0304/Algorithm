package Java.programmers;


public class P12932 {
    public static int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        char[] charStr = str.toCharArray();
        int index = str.length()-1;

        for(char s : charStr) {
            answer[index] = s - '0';
            index--;
        }
        return answer;
    }

    public static void main(String[] args) {
        for(int i : solution(12345)) {
            System.out.println(i);
        }
    }
}
