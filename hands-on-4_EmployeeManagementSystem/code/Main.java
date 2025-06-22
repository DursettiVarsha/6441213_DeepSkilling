public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5); 

        Employee e1 = new Employee(101, "Alice", "Manager", 80000);
        Employee e2 = new Employee(102, "Bob", "Developer", 60000);
        Employee e3 = new Employee(103, "Charlie", "Designer", 55000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.listEmployees();

        System.out.println("\nSearching for employee ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting employee ID 102:");
        manager.deleteEmployee(102);

        manager.listEmployees();
    }
}
