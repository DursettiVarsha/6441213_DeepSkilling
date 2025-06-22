public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size >= employees.length) {
            System.out.println("Employee list is full.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Added: " + emp);
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];  
                }
                employees[--size] = null;
                System.out.println("Deleted employee ID " + employeeId);
                return;
            }
        }
        System.out.println("Employee ID " + employeeId + " not found.");
    }

    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
