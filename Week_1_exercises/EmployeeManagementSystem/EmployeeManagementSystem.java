package DigitalNuture;

public class EmployeeManagementSystem {
	
	    private Employee[] employees;
	    private int count;

	    public EmployeeManagementSystem(int capacity) {
	        employees = new Employee[capacity];
	        count = 0;
	    }

	    public void addEmployee(Employee employee) {
	        if (count < employees.length) {
	            employees[count] = employee;
	            count++;
	        } else {
	            System.out.println("Array is full. Cannot add more employees.");
	        }
	    }

	    public Employee searchEmployee(String employeeId) {
	        for (int i = 0; i < count; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                return employees[i];
	            }
	        }
	        return null;
	    }

	    public void traverseEmployees() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(employees[i]);
	        }
	    }

	    public void deleteEmployee(String employeeId) {
	        int index = -1;
	        for (int i = 0; i < count; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            for (int i = index; i < count - 1; i++) {
	                employees[i] = employees[i + 1];
	            }
	            employees[count - 1] = null;
	            count--;
	        } else {
	            System.out.println("Employee not found.");
	        }
	    }
	}



