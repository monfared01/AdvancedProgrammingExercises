import java.util.Scanner;

public class KNPTriangle {
	private int table[][];

	public int[][] getTable() {
		return this.table;
	}

	public void setTable(int table[][]) {
		this.table = table;
	}

	public KNPTriangle(int Num) {
		this.table = new int[Num][];

		for (int i = 0; i < Num; i++) {
			this.table[i] = new int[i + 1];
			this.table[i][0] = 1;
			this.table[i][i] = 1;
			for (int j = 1; j < i; j++) {
				this.table[i][j] = this.table[i - 1][j] + this.table[i - 1][j - 1];
			}
		}
	}

	public void show() {
		for (int i = 0; i < this.table.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(this.table[i][j] + " ");
			}
			System.out.println(1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KNPTriangle tri = new KNPTriangle(sc.nextInt());
		sc.close();

		tri.show();
	}

}
