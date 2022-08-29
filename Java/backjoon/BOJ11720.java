package Java.backjoon;

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
    }
}

