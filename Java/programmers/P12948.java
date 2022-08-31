package Java.programmers;

import java.util.Scanner;

public class P12948 {
    public static void main(String[] args) {
        /*
         * Level 1. 핸드폰 번호 가리기
         *  전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴
         */

         Scanner sc = new Scanner(System.in);
         String answer = "";
         String phone_number = sc.nextLine();

         String ssn = phone_number.substring(phone_number.length()-4);
         for(int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
         }
         answer += ssn;

         System.out.println(answer);
    }
    
}
