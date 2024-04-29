

import java.util.Scanner;

public class Chapter2_17 {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print ("Enter your first integer : ");
        int num1 = input.nextInt();

        System.out.print ("Enter your second integer : ");
        int num2 = input.nextInt();

        System.out.print ("Enter your third integer : ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3 ;
        int product = num1 * num2 * num3;
        
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println();
        
        System.out.printf ("The sum is %d%n", sum);
        System.out.printf ("The Average is %d%n", average);
        System.out.printf ("The product is %d%n", product);
        System.out.printf("The minimum is %d%n", min);
        System.out.printf("The maximum is %d%n", max);
        
        input.close();
    }
}