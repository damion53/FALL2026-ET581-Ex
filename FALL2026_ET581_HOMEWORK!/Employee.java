public class Employee {
    // 1. Fields (Member Variables)[cite: 1]
    private int id;
    private String name;
    private double salary;

    // 6. Static Variable[cite: 2]
    private static int totalEmployees = 0;

    // 2. Constructor & 6. Increment totalEmployees[cite: 1, 2]
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    // 3. Getter and Setter Methods[cite: 1]
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 4. toString() Method[cite: 1]
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    // 5. equals() Method[cite: 2]
    public boolean equals(Employee e) {
        if (e == null) {
            return false;
        }
        return this.id == e.id;
    }

    // 7. Static Method[cite: 2]
    public static void printTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}
