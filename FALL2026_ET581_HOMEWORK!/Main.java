public class Main {
    public static void main(String[] args) {
        // Create Employee objects
        Employee e1 = new Employee(101, "Alice", 5000.0);
        Employee e2 = new Employee(102, "Bob", 6500.0);
        Employee e3 = new Employee(103, "Charlie", 5500.0);

        // Display each employee using toString()
        System.out.println("Employee Details:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Update salary using setter
        System.out.println("\nAfter updating Alice's salary:");
        e1.setSalary(5200.0);
        System.out.println(e1);

        // Test equals()
        Employee e4 = new Employee(101, "Damion", 7000.0);

        System.out.println("\nTesting equals():");
        System.out.println(e1.equals(e4));

        // Show total number of Employee objects created
        System.out.println("\nTotal Employees:");
        Employee.printTotalEmployees();
    }
}