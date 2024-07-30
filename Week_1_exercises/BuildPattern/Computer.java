package DigitalNuture;

public class Computer {
	
	    // Attributes
	    private String CPU;
	    private String RAM;
	    private String storage;
	    

	    // Private constructor to take the builder as a parameter
	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	       
	    }

	    // Getters for attributes (optional)
	    public String getCPU() {
	        return CPU;
	    }

	    public String getRAM() {
	        return RAM;
	    }

	    public String getStorage() {
	        return storage;
	    }

	    

	    @Override
	    public String toString() {
	        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + "]";
	    }

	    // Static nested Builder class
	    public static class Builder {
	        private String CPU;
	        private String RAM;
	        private String storage;
	        

	        // Methods to set each attribute
	        public Builder setCPU(String CPU) {
	            this.CPU = CPU;
	            return this;
	        }

	        public Builder setRAM(String RAM) {
	            this.RAM = RAM;
	            return this;
	        }

	        public Builder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	       

	        // Method to build the Computer instance
	        public Computer build() {
	            return new Computer(this);
	        }
	    }
	}



