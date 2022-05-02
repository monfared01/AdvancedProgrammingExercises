import java.util.Scanner;

public class Sorter {
	private String words[];

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		String temp;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareToIgnoreCase(words[j]) > 0) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		this.words = words;
	}

	public Sorter(String[] words) {
		setWords(words);
	}

	public void show() {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String words[] = new String[10];
		for (int i = 0; i < 10; i++) {
			words[i] = sc.nextLine();
		}
		sc.close();
		
		Sorter s = new Sorter(words);
		s.show();
	}
}
