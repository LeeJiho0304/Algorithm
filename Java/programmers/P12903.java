package Java.programmers;

import java.util.Scanner;

public class P12903 {
    /*
     * Level 1. 가운데 글자 가져오기
     * 단어 s의 길이가 짝수면 가운데 두글자를 반환
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");

        String answer = "";

        if(str.length % 2 == 0) {
            answer = str[str.length/2-1] + str[str.length/2];
        } else {
            answer = str[str.length/2];
        }

        System.out.println(answer);

    }
}
