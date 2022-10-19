class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String row = Integer.toBinaryString(arr1[i] | arr2[i]);

            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < row.length(); j++) {
                if(row.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            while (sb.length() < n) {
                sb.insert(0, " ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}