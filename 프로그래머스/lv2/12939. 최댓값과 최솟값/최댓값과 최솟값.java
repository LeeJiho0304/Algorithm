import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strNum = s.split(" ");
        
        int[] nums = Arrays.stream(strNum)
                        .mapToInt(n -> Integer.parseInt(n))
                        .toArray();

        Arrays.sort(nums);
        String min = String.valueOf(nums[0]);
        String max = String.valueOf(nums[nums.length-1]);

        answer = min + " " + max;
        return answer;
    }
}