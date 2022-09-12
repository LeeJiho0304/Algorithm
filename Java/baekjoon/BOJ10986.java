package Java.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class BOJ10986 {
    public static void main(String[] args) throws IOException {
        //https://www.acmicpc.net/problem/10986
        //백준 10986번 나머지 합
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long count = 0;
   
        S[0] = sc.nextInt();
        for(int i = 1; i < N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int remainder = (int)(S[i] % M);
            if(remainder == 0) {
                //0~i 까지의 구간 합 % M 자체가 0일때 정답 더하기
                count++; 
            }
            C[remainder]++; //나머지가 같은 인덱스의 개수 카운팅
        }

        for(int i = 0; i < M; i++) {
            if(C[i] > 1) {
                //나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
                count = count + (C[i] * (C[i]-1) / 2);
            }
        }
        System.out.println(count);
    }
}
