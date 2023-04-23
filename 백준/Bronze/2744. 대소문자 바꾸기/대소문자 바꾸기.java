import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z') { //대문자일 경우
                System.out.print((char)('a' + ch - 'A'));
            } else { //소문자일 경우
                System.out.print((char)('A' + ch - 'a'));
            }
        }
	}
}
