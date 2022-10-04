class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd  = 1; //최대공약수 
        int lcm = 1; //최소공배수
        
        if(m % n == 0) return new int[] {n, m};
        if(n == 1 || m == 1) return new int[] {1, n*m};
        
        for(int i = 1; i < n; i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        lcm = n * m / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}