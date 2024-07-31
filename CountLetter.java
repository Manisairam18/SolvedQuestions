
import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the string S
		System.out.println("Enter the string S: ");
		String S = scanner.nextLine();

		// Read the integer N
		System.out.println("Enter the integer N: ");
		int N = getValidIntegerInput(scanner);

		int countOfA = countLetterA(S, N);

		System.out.println("Output : ");

		System.out.println(countOfA);
	}

	public static int getValidIntegerInput(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer.");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public static int countLetterA(String S, int N) {
		int length = S.length();
		int countInS = countOccurrences(S, 'a');

		int fullRepetitions = N / length;
		int extraChars = N % length;

		int totalCount = fullRepetitions * countInS;

		for (int i = 0; i < extraChars; i++) {
			if (S.charAt(i) == 'a') {
				totalCount++;
			}
		}

		return totalCount;
	}

	public static int countOccurrences(String str, char ch) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == ch) {
				count++;
			}
		}
		return count;
	}
}
