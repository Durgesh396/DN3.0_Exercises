package DigitalNuture;

public class Driver {
	
	    public static void main(String[] args) {
	        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

	        // Adding Employees
	        ems.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
	        ems.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
	        ems.addEmployee(new Employee("E003", "Charlie", "Analyst", 60000));
	        ems.addEmployee(new Employee("E004", "David", "Designer", 55000));
	        ems.addEmployee(new Employee("E005", "Eve", "HR", 45000));

	        // Traversing Employees
	        System.out.println("All Employees:");
	        ems.traverseEmployees();

	        // Searching Employee
	        System.out.println("\nSearch Employee (E003):");
	        Employee employee = ems.searchEmployee("E003");
	        System.out.println(employee);

	        // Deleting Employee
	        System.out.println("\nDelete Employee (E003):");
	        ems.deleteEmployee("E003");
	        ems.traverseEmployees();
	    }
	}



