package Java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2896 {
    public static void main(String[] args) throws IOException {
        //https://www.acmicpc.net/problem/2869
        //백준 2869번 달팽이는 올라가고 싶다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(stringTokenizer.nextToken());
        int down = Integer.parseInt(stringTokenizer.nextToken());
        int height = Integer.parseInt(stringTokenizer.nextToken());
        
        int result = (height - down) / (up - down);
        
        if((height - down) % (up - down) != 0) result++;

        System.out.println(result);
    }
}
