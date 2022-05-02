import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String words[] = new String[10];

		for (int i = 0; i < 10; i++) {
			words[i] = sc.nextLine();
		}
		String tmp = sc.nextLine();

		sc.close();

		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (words[i].contains(tmp)) {
				System.out.println("yes");
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("no");
	}
}
