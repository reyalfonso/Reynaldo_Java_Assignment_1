
import java.util.Scanner;

public class Chapter4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) { // Input 3 employee and calculate 
            System.out.println();
            System.out.println("Enter details for Employee " + i + ":");

            System.out.print("Enter hours worked last week: ");
            int hoursWorked = scanner.nextInt();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            double grossPay = calculateGrossPay(hoursWorked , hourlyRate);

            // gross pay for the employee
            System.out.println("Gross pay for Employee " + i + " is $" + grossPay);
            System.out.println();
        }

        scanner.close();
    }


    // calculating gross pay
    public static double calculateGrossPay(int hoursWorked, double hourlyRate) {
        double regularPay;
        double overtimePay = 0;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyRate;
            overtimePay = (hoursWorked - 40) * (hourlyRate * 1.5);
        }

        return regularPay + overtimePay;
    }
}
