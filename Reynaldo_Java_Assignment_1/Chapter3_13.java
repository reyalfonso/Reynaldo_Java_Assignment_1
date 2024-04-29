
public class Chapter3_13 {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Steve", "Austin", 3000);
        Employee employee2 = new Employee("Jannet", "Smith", 4000);
        System.out.println();
        
        System.out.printf ("%s %s Yearly Salary is $%.2f \n", 
            employee1.getFirstName(), 
            employee1.getLastName(),
            employee1.yearlySalary());
        System.out.printf ("%s %s Yearly Salary is $%.2f \n", 
            employee2.getFirstName(), 
            employee2.getLastName(),
            employee2.yearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        // yearly salary after the raise
        System.out.printf ("%s %s Yearly Salary after raise is $%.2f \n", 
            employee1.getFirstName(), 
            employee1.getLastName(),
            employee1.yearlySalary());
        System.out.printf ("%s %s Yearly Salary after raise is $%.2f \n", 
            employee2.getFirstName(), 
            employee2.getLastName(),
            employee2.yearlySalary());
        
    }
}
