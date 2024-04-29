
import java.util.Scanner;

public class Chapter2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println();

        System.out.print("Enter first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();
        System.out.println();

        if (number1 == number2) {
            System.out.println("These numbers are equal.");
        }
            
        if (number1 < number2) {
            System.out.printf("%d is larger than %d.\n", number2, number1 );
        }

        if (number1 > number2) {
            System.out.printf("%d is larger than %d.\n", number1, number2);
            
        }

        input.close();
    }
 }