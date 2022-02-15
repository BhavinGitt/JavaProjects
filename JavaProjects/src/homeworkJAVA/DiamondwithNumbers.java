package homeworkJAVA;

public class DiamondwithNumbers {

	public static void main(String[] args) {
		int row = 4, i, j, space;
		space = row-1 ;
		for (j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");           // printing on one line --> spaces
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print(row-j);
			}
			System.out.println("");
		}
	}

	



	}


