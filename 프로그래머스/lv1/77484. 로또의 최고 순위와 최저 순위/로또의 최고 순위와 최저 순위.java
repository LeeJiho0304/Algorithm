class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; // 최고, 최저
        int[] rank = {6, 6, 5, 4, 3, 2, 1};  // 순위표
        
        int max = 0;  // 최대 갯수
        int min = 0;  // 최소 갯수
        
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                max++;
            }
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]){
                    min++;
                    max++;
                }
            }
        }
        answer[0] = rank[max];
        answer[1] = rank[min];
        
        return answer;
    }
}