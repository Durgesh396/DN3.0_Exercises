package DigitalNuture;

public class Driver {
	
	    public static void main(String[] args) {
	        TaskLinkedList taskList = new TaskLinkedList();

	        // Adding Tasks
	        taskList.addTask(new Task("T001", "Task 1", "Pending"));
	        taskList.addTask(new Task("T002", "Task 2", "In Progress"));
	        taskList.addTask(new Task("T003", "Task 3", "Completed"));

	        // Traversing Tasks
	        System.out.println("All Tasks:");
	        taskList.traverseTasks();

	        // Searching for a Task
	        System.out.println("\nSearch Task (T002):");
	        Task task = taskList.searchTask("T002");
	        System.out.println(task);

	        // Deleting a Task
	        System.out.println("\nDelete Task (T002):");
	        taskList.deleteTask("T002");
	        taskList.traverseTasks();
	    }
	}



