class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals(" ")){
                idx = 0;
            }
            else if(idx % 2 == 0){ 
                strArr[i] = strArr[i].toUpperCase();
                idx++;
            }
            else if(idx % 2 != 0){ 
                strArr[i] = strArr[i].toLowerCase();
                idx++;
            }
            sb.append(strArr[i]);
        }
        
        return sb.toString();
    }
}