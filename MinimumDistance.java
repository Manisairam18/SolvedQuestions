
import java.util.Scanner;

public class MinimumDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = getValidIntegerInput(scanner);
        
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = getValidIntegerInput(scanner);
        }

        int minDistance = findMinimumDistance(array);
        System.out.println(" The Distance :  ");
        System.out.println(minDistance);
    }

    public static int getValidIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    public static int findMinimumDistance(int[] array) {
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

       
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    int distance = j - i;
                    if (distance < minDistance) {
                        minDistance = distance;
                        found = true;
                    }
                }
            }
        }

        return found ? minDistance : -1;
    }
}

