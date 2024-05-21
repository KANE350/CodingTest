
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int N = in.nextInt();
		int sum = 0;

		
		for(int i=1; i<=N; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			    sum = sum + a*b;
		}
		
		if(sum == X) {
			System.out.println("Yes");
			
		}else{
			System.out.println("No");
		}
		
		
		
	}
}