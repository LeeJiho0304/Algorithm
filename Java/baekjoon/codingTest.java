package Java.baekjoon;
import java.util.Scanner;

public class codingTest {
    static int AnswerN;
	static int N = 10;

    /*
     * 장기판에서 포가 먹을 수 있는 알의 수
     * X 는 이동 가능
     * Y 는 이동 불가능
     * 일반 알은 H, 빈칸은 L
     * X 는 다른 다른 Y 를 넘을 수 없으며 한 알을 넘어야 다른 알을 먹을 수 있다.
     */
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

        // L, R, U, D
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 0;
        int y = 0;

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
            sc.nextLine();
            char[][] tt = new char[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    tt[i][j] = sc.nextLine().charAt(j);
                    if(tt[i][j] == 'X') {
                        x = i;
                        y = j;
                    }
                }
            }
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}
