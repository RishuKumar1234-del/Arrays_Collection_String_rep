package Arrays.starPattern;

public class PrintOnlyLeftDiagonal {

	public static void main(String[] args) {
		System.out.println("following is the star pattern of left diagonal: ");
		printStarPatternOfLeftDiagonal();
		System.out.println();

		System.out.println("following is the star pattern of right diagonal: ");
 		printStarPatternOfRightDiagonal();
	}
	public static void printStarPatternOfLeftDiagonal() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printStarPatternOfRightDiagonal() {
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
				for(int k=1;k<=i;k++) {
					if(i>=2 && k>1) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
					
				}
				System.out.println();
			}
		}
	}

}
