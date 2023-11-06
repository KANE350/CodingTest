	public class Main {
		public static void main(String[] args) {
			
	    //    			 ,r'"7
	    //     r`-_   ,'  ,/
	    //      \. ". L_r'
	    //        `~\/
	    //           |
	    //           |
		
			String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
					   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
					   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
					   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
					   "      |\n" + 			// \n 이 제어문자다.
					   "      |";
	 
			System.out.print(s);
			
			}
	}