class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char password;

		for(int i = 0; i < s.length(); i++) {
			char str = s.charAt(i);
			if( str + n > 'z') {
				password = (char) (str + n - 26);
			} else if( str < 'a' && str + n > 'Z') {
                password = (char) (str + n - 26);
            } else if(str == ' ') {
                password = (char)' ';
            } else {
				password = (char) (str + n);
			} 

            answer += String.valueOf(password);
		}
        
        return answer;
    }
}