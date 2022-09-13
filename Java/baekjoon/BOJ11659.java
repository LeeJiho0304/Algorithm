package Java.baekjoon;

<<<<<<< HEAD
public class BOJ11659 {
    
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        //https://www.acmicpc.net/problem/11659
        //백준 11659번 구간 합 구하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[N+1];
        stringTokenizer = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q = 0; q < M; q++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            
            System.out.println(S[j] - S[i-1]);
        }
    }
>>>>>>> c9d014203fc6ccad8eeeed58c3d2f208a1c2f0ed
}
