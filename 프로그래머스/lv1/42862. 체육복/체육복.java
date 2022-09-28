import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생수 n만큼 int student[n] = 1로 초기화 선언 answer = n;
        // 그중 lost를 돌며 해당 index에 -1,  reserver는 +1
        // 값이 0일때, 좌우로 값이 2가 없는 경우는 answer-- 빌려준 학생 옷 -1
        int answer = n;
        int []student = new int[n];

        Arrays.fill(student, 1);

        for (int i : lost)
            student[i - 1] -= 1;

        for (int i : reserve)
            student[i - 1] += 1;

        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) //왼쪽 검사
                    student[i - 1] -= 1;
                else if (i < n - 1 && student[i + 1] == 2)
                    student[i + 1] -= 1;
                else
                    answer--;
            }
        }
        return answer;
    }
}