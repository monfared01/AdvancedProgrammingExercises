import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

	    int c = 0;
	    
	    String input = sc.nextLine();
	    sc.close();
	    
	    for (int i = 0; i < input.length(); i++) {
	      switch (input.charAt(i)) {
	        case '(':
	          c++;
	          break;
	        case ')':
	          c--;
	      }

	      if (c < 0) {
	        System.out.println("false");
	        return;
	      }
	    	}

	    if (c > 0) {
	      System.out.println("false");
	      return;
	    }

	    System.out.println("true");
	  }
}
