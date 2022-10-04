import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] num = sc.nextLine().split(" ");
        int gcd  = 1; //최대공약수 
        int lcm = 1; //최소공배수
        
        int n = Math.min(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
        int m = Math.max(Integer.parseInt(num[0]), Integer.parseInt(num[1]));

        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        lcm = n * m / gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
	}

}