package DigitalNuture;

public class BuilderPatternTest {
	    public static void main(String[] args) {
	        // Create a computer with only CPU and RAM
	        Computer basicComputer = new Computer.Builder()
	                .setCPU("Intel i5")
	                .setRAM("8GB")
	                .build();

	        System.out.println(basicComputer);

	        // Create a high-end computer with all components
	        Computer gamingComputer = new Computer.Builder()
	                .setCPU("Intel i9")
	                .setRAM("32GB")
	                .setStorage("1TB SSD")
	                .build();

	        System.out.println(gamingComputer);
	    }
	}



