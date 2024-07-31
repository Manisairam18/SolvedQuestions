
import java.util.Scanner;

public class SockColour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of socks: ");
        int size = getValidIntegerInput(scanner);

        int[] socks = new int[size];
        System.out.println("Enter the sock colors: ");
        for (int i = 0; i < size; i++) {
            socks[i] = getValidIntegerInput(scanner);
        }

        int numberOfPairs = countSockPairs(socks);
        
        System.out.println("Matching socks: ");
        System.out.println(numberOfPairs);
    }

    public static int getValidIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    public static int countSockPairs(int[] socks) {
        int max = findMax(socks);
        int[] frequency = new int[max + 1]; 


        for (int sock : socks) {
            frequency[sock]++;
        }

        int totalPairs = 0;
        for (int count : frequency) {
            totalPairs += count / 2; 
        }

        return totalPairs;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
