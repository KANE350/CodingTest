import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int x = in.nextInt();
	int y = in.nextInt();
	
	//−1000 ≤ x ≤ 1000; x ≠ 0) 
	
	if((x >= 1 && x <= 1000 && x !=0 )&&(y >= 1 && y <= 1000 && y !=0)){
		System.out.println(1);
	}else if((x >= -1000 && x <= 1 && x !=0)&&(y >= 1 && y <= 1000 && y !=0)){
		System.out.println(2);
	}else if((x >= -1000 && x <= 1 && x !=0)&&(y >= -1000 && y <= 1 && y !=0)){
		System.out.println(3);
	}else if((x >= 1 || x >= 100 && x !=0)&&(y >= -1000 && y <= 1 && y !=0)){
		System.out.println(4);
	}

 }
}
