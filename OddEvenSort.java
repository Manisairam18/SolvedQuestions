
//public class OddEvenSort {
//
//	public static void main(String[] args) {
//		int[] arr = { 13, 2, 4, 15, 12, 10, 5 };
//
//		// Separate odd and even indexed elements
//		int oddCount = (arr.length + 1) / 2;
//		int evenCount = arr.length / 2;
//		int[] odd = new int[oddCount];
//		int[] even = new int[evenCount];
//
//		for (int i = 0, oddIndex = 0, evenIndex = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				odd[oddIndex++] = arr[i];
//			} else {
//				even[evenIndex++] = arr[i];
//			}
//		}
//
//		// Sort odd indexed elements in descending order
//		sortDescending(odd);
//
//		// Sort even indexed elements in ascending order
//		sortAscending(even);
//
//		// Merge the sorted arrays back into the original array
//		for (int i = 0, oddIndex = 0, evenIndex = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				arr[i] = odd[oddIndex++];
//			} else {
//				arr[i] = even[evenIndex++];
//			}
//		}
//
//		// Print the sorted array
//		for (int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//
//	// Method to sort an array in descending order
//	private static void sortDescending(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}
//
//	// Method to sort an array in ascending order
//	private static void sortAscending(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}
//}
import java.util.Scanner;

public class OddEvenSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int oddCount = (arr.length + 1) / 2;
		int evenCount = arr.length / 2;
		int[] odd = new int[oddCount];
		int[] even = new int[evenCount];

		for (int i = 0, oddIndex = 0, evenIndex = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				odd[oddIndex++] = arr[i];
			} else {
				even[evenIndex++] = arr[i];
			}
		}

		sortDescending(odd);

		sortAscending(even);

		for (int i = 0, oddIndex = 0, evenIndex = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = odd[oddIndex++];
			} else {
				arr[i] = even[evenIndex++];
			}
		}

		System.out.print("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		scanner.close();
	}

	private static void sortDescending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static void sortAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
