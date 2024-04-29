
import java.util.Scanner;

public class Chapter4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number of customers
        System.out.print("Enter the number of customers: ");
        int customers = scanner.nextInt();

        // Input loop for each customer
        for (int i = 1; i <= customers; i++) {
            System.out.println("\nEnter details for Customer " + i + ":");

            System.out.print("Enter the customer account number: CN-");
            int accountNumber = scanner.nextInt();

            System.out.print("Enter the balance at the beginning of the month: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter the total of all items charged by the customer this month: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Enter the total of all credits applied this month: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Enter customer allowed credit limit: ");
            int creditLimit = scanner.nextInt();
            System.out.println();

            // Calculate the new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Display the new balance
            System.out.printf ("New balance for Account number: CN-%d is $%d\n ", 
                    accountNumber, 
                    newBalance);

            // Determine if the new balance exceeds the credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }

        scanner.close();
    }
}
