package Java.baekjoon;

import java.util.Scanner;
public class BOJ11720 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/11720
        // 백준 11720번 숫자의 합
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        String[] strNum = sc.nextLine().split("");
        int sum = 0;

        for (int i = 0; i < N; i++) {		
            sum += Integer.parseInt(strNum[i]);
        }

        System.out.println(sum);

        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변한하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i]를 정수형을 변환하면서 sum에 더하여 누적하기
        }

        System.out.println(sum);
         */
    }

}
