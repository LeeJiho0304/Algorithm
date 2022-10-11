class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        char[] arr = s.toLowerCase().toCharArray();
        
        for(char c : arr) {
            if(c == 'p') pCnt++;
            if(c == 'y') yCnt++;
        }

        return pCnt == yCnt? true : false;
    }
}
