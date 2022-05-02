package matrixEx;

public class Matrix {
	private int[][] elements;

	public Matrix(int[][] elements) {
		this.elements = elements;
	}

	public int[][] getElements() {
		return elements;
	}

	public Matrix transpose() {
		int[][] tmp = new int[elements[0].length][elements.length];
		for (int i = 0; i < elements[0].length; i++) {
			for (int j = 0; j < elements.length; j++) {
				tmp[i][j] = elements[j][i];
			}
		}
		return new Matrix(tmp);
	}

	public void show() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[0].length; j++) {
				System.out.print("| " + elements[i][j] + " |");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix b) throws Exception {
		if (elements.length != b.getElements().length || elements[0].length != b.getElements()[0].length) {
			throw new Exception("invalid Matrix");
		} else {
			int C[][] = new int[elements.length][elements[0].length];

			for (int i = 0; i < elements.length; i++)
				for (int j = 0; j < elements[0].length; j++)
					C[i][j] = elements[i][j] + b.getElements()[i][j];
			return new Matrix(C);
		}
	}

	public Matrix multiply(Matrix b) throws Exception {
		if (elements[0].length != b.getElements().length) {
			throw new Exception("invalid Matrix");
		} else {
			int[][] result = new int[elements.length][b.getElements()[0].length];

			for (int row = 0; row < result.length; row++) {
				for (int col = 0; col < result[row].length; col++) {
					int cell = 0;
					for (int i = 0; i < b.getElements().length; i++) {
						cell += elements[row][i] * b.getElements()[i][col];
					}
					result[row][col] = cell;
				}
			}
			return new Matrix(result);
		}
	}

}

