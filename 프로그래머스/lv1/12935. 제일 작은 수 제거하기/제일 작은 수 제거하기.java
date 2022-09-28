class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];        
        
        int min = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        
        for(int i = 0; i < arr.length-1; i++) {
            if(i < index)
                answer[i] = arr[i];
            else {
                answer[i] = arr[i+1];
            }
        }

        return answer;
    }
}