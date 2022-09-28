class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String[] arr = String.valueOf(x).split("");

		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
        
        if(sum == 1) return true;
        if(x % sum == 0) return true;
        
        return false;
    }
}