package DigitalNuture;


	public class DependencyInjectionTest {
	    public static void main(String[] args) {
	        // Create the repository instance
	        CustomerRepository customerRepository = new CustomerRepositoryImpl();

	        // Inject repository into service
	        CustomerService customerService = new CustomerService(customerRepository);

	        // Use the service to get customer details
	        String customerDetails = customerService.getCustomerDetails(1);
	        System.out.println(customerDetails);
	    }
	}


	

