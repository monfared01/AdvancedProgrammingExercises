import java.util.Scanner;

public class MatrixMultiplier {
	private int output[][];
	
	public int[][] getOutput() {
		return output;
	}

	public MatrixMultiplier(int[][] mat1, int[][] mat2) {
		output = new int[mat1.length][mat2[0].length];
		
		for (int x1 = 0; x1 < mat1.length; x1++) {
			for (int y1 = 0; y1 < mat2.length; y1++) {
				for (int y2 = 0; y2 < mat2[0].length; y2++) {
					for (int x2 = 0; x2 < mat2.length; x2++) {
						int sum = 0;
						if (y1 == x2) {
							sum = mat1[x1][y1] * mat2[x2][y2] + sum;
						}
						output[x1][y2] = sum + output[x1][y2];
					}
				}
			}
		}
	}
	
	public void show() {
        for (int i = 0; i < output.length ; i++) {
            for (int j = 0; j < output[0].length ; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		int mat1[][] = new int[n1][n2];
		int mat2[][] = new int[n2][n3];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n3; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		MatrixMultiplier mm = new MatrixMultiplier(mat1, mat2);
		mm.show();
	}
}
