package Java.baekjoon;

import java.util.Scanner;

public class BOJ2798 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/2798
        //백준 2798번 블랙잭
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int result = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= M && result < sum) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
