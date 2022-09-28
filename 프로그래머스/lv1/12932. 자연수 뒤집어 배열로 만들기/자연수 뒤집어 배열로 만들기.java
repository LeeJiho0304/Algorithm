class Solution {
    public int[] solution(long n) {
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
}