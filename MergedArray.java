

import java.util.Scanner;

public class MergedArray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1st Array size: ");
        int n1 = getValidIntegerInput(obj);
        System.out.println("Enter 1st Array Elements: ");
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = getValidIntegerInput(obj);
        }

        System.out.println("Enter 2nd Array size: ");
        int n2 = getValidIntegerInput(obj);
        System.out.println("Enter 2nd Array Elements: ");
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = getValidIntegerInput(obj);
        }

        int merge_arr[] = new int[array1.length + array2.length];
        System.out.println("Merged Array: ");
        int result[] = new int[merge_arr.length];

        int j = 0;
        for (int i = 0; i < merge_arr.length; i++) {
            if (i < array1.length) {
                merge_arr[i] = array1[i];
            } else {
                merge_arr[i] = array2[j];
                j++;
            }
        }

        for (int i = 0; i < merge_arr.length; i++) {
            for (int s = i + 1; s < merge_arr.length; s++) {
                if (merge_arr[i] > merge_arr[s]) {
                    int temp = merge_arr[i];
                    merge_arr[i] = merge_arr[s];
                    merge_arr[s] = temp;
                }
            }
        }

        for (int i = 0; i < merge_arr.length; i++) {
            int count = 1;
            for (int k = i + 1; k < merge_arr.length; k++) {
                if (merge_arr[i] == merge_arr[k]) {
                    count++;
                    result[k] = -1;
                }
            }
            if (result[i] != -1) {
                result[i] = count;
            }

            if (result[i] > 0) {
                System.out.print(merge_arr[i] + " ");
            }
        }
    }

    public static int getValidIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}
