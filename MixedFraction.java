
import java.util.Scanner;

public class MixedFraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a rational number: ");
        float number = getValidFloatInput(scanner);

        String mixedFraction = convertToMixedFraction(number);
        System.out.println(mixedFraction);
    }

    public static float getValidFloatInput(Scanner scanner) {
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a float.");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    
    public static String convertToMixedFraction(float number) {
        int integerPart = (int) number;
        float fractionalPart = number - integerPart;

        int numerator = (int) (fractionalPart * 10000); 
        int denominator = 10000;
        int gcd = findGCD(numerator, denominator);

     
        numerator /= gcd;
        denominator /= gcd;

      
        if (numerator == 0) {
            return String.valueOf(integerPart); 
        } else {
            return integerPart + " " + numerator + "/" + denominator;
        }
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
