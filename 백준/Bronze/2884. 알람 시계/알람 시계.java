import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int H = in.nextInt();
	int M = in.nextInt();
	
	// (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
    //24:23 끝에 0은 생략한다 
	
	if((H>=0) && (H<=23) && (M<=59) && (M>=0)){ 
	  if((M<45) && (H<1)){
		  H = 24-1;
		  M = (M - 45)+60;
		  System.out.printf("%d %d", H, M );

	  }else if(M<45){
		  H = H - 1;
		  M = (M - 45)+60;
		  System.out.printf("%d %d", H, M );
	  }else{
		  M = M - 45;
		  System.out.printf("%d %d", H, M) ;
	  }
	}


 }
}