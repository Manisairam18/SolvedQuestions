
import java.util.Scanner;

public class DiamondPattern {

	public void print_pattern(int n) {

		int no = (n - 1) * 2;
		for (int row = 1; row < n * 2; row++) {

			int temp = n * row - (n - 1);
			if (row <= n) {
				for (int space = row; space < n; space++) {
					System.out.print(" ");
				}
				for (int num = 1; num <= row; num++) {

					System.out.print(temp + " ");
					temp -= n - 1;

				}

			} else {

				temp = n * row - no;
				for (int space = row; space > n; space--) {
					System.out.print(" ");
				}
				for (int num = row; num < n * 2; num++) {

					System.out.print(temp + " ");
					temp -= n - 1;

				}
				no += n - 1;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		DiamondPattern obj = new DiamondPattern();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		scan.close();
		obj.print_pattern(n);

	}
}
