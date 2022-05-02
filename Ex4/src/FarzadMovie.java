import java.util.Scanner;

public class FarzadMovie {

	public static String Cap(String str) {
		String name = str.toLowerCase();
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		for (int i = 0; i < str.length() - 1; i++) {
			char Space = ' ';
			if (name.charAt(i) == Space) {
				name = name.substring(0, i) + " " + Character.toUpperCase(name.charAt(i + 1)) + name.substring(i + 2);
			}
		}
		return name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int NumberOfMovies = sc.nextInt();
		String NameOfMovies[] = new String[NumberOfMovies];

		NameOfMovies[0] = sc.nextLine();
		for (int i = 0; i < NumberOfMovies; i++) {
			NameOfMovies[i] = sc.nextLine();
		}
		
		sc.close();
		
		for (int i = 0; i < NumberOfMovies; i++) {
			NameOfMovies[i] = Cap(NameOfMovies[i]);
			System.out.println(NameOfMovies[i]);
		}
	}
}
