package Java.programmers;

import java.util.Scanner;

public class P12918 {
    /*
     * Level 1. 문자열 다루기 기본
     * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인
     * s가 "a234"이면 False, "1234"라면 True
     */
    public static void main(String[] args) {
        boolean answer = true;
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
