class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        char[] arr = s.toLowerCase().toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'p') pCnt++;
            if(arr[i] == 'y') yCnt++;
        }

        return pCnt == yCnt? true : false;
    }
}
