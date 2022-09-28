class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int total = 0;
        
        for(int n : numbers) {
            total += n;
        }
        
        answer = 45 - total;  //45 는 0~9까지 합

        return answer;
    }
}