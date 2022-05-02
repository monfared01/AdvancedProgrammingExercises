
import java.util.Scanner;

public class SymmetricalString {

	public static String Symmetry(String str) {
		String tmp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tmp = tmp + str.charAt(i);
		}
		return tmp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		sc.close();

		if (tmp.equals(Symmetry(tmp))) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}
}
