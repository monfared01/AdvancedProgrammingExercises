import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		int s = in.nextInt();
		boolean flage = false;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == s) {
				flage = true;
				break;
			}
		}
		if(flage == true)
			System.out.println("yes");
		else
			System.out.println("no");
		
		in.close();
	}

}
