package Arrays;

import java.util.Scanner;

public class SwappingOfDiagonalElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SwappingOfDiagonalElements sde = new SwappingOfDiagonalElements();

		System.out.println("enter rows and column of the matrix");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] A=new int[m][n];
		sde.enterTheElementsOfTheMatrix(A, m, n);
		if (m == n) {
		sde.swapTheDiagonalOfAMatrix(A, m, n);
		} else {
			System.err.println("swapping of diagonal element is not possible for this matrix");
		}

	}

	// resource for taking elements of the user from the user
	public void enterTheElementsOfTheMatrix(int[][] ar, int row, int column) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the elements of the matrix");
		ar = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				ar[i][j] = scan.nextInt();
			}
		}

	}

	// resource for print the matrix
	public void printTheMatrix(int[][] ar, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	// resource for swapping the diagonal
	public void swapTheDiagonalOfAMatrix(int[][] ar, int row, int column) {
		//enterTheElementsOfTheMatrix(ar, row, column);
		System.out.println("the original matrix is: ");
		printTheMatrix(ar, row, column);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int temp = ar[i][i];
				ar[i][i] = ar[i][row - i - 1];
				ar[i][row - i - 1] = temp;
			}
		}
		System.out.println("the matrix after swapping is: ");
		printTheMatrix(ar, row, column);

	}

}
