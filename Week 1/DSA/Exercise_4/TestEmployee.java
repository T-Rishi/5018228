
public class TestEmployee {
     private Employee[] employees;
    private int count;

    public TestEmployee(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    // Search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by ID
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[count - 1]; // Replace with last employee
                employees[count - 1] = null; // Clear last element
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        TestEmployee system = new TestEmployee(10);

        // Add employees
        system.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        system.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        system.addEmployee(new Employee(3, "Charlie", "Designer", 50000));

        // Traverse and display all employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Search for an employee by ID
        System.out.println("\nSearch for Employee with ID 2:");
        Employee employee = system.searchEmployee(2);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee by ID
        System.out.println("\nDelete Employee with ID 2:");
        system.deleteEmployee(2);

        // Traverse and display all employees again
        System.out.println("\nAll Employees After Deletion:");
        system.traverseEmployees();
    }
}
