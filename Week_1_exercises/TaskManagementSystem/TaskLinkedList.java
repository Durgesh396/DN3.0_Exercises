package DigitalNuture;

public class TaskLinkedList {
	
	    private Node head;

	    public TaskLinkedList() {
	        this.head = null;
	    }

	    public void addTask(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public Task searchTask(String taskId) {
	        Node current = head;
	        while (current != null) {
	            if (current.data.getTaskId().equals(taskId)) {
	                return current.data;
	            }
	            current = current.next;
	        }
	        return null;
	    }

	    public void traverseTasks() {
	        Node current = head;
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	    public void deleteTask(String taskId) {
	        if (head == null) {
	            return;
	        }

	        if (head.data.getTaskId().equals(taskId)) {
	            head = head.next;
	            return;
	        }

	        Node current = head;
	        Node previous = null;
	        while (current != null && !current.data.getTaskId().equals(taskId)) {
	            previous = current;
	            current = current.next;
	        }

	        if (current == null) {
	            return;
	        }

	        previous.next = current.next;
	    }
	}



