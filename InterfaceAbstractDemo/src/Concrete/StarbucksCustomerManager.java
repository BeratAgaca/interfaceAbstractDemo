package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
 
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	
	
	@Override
	public void Save(Customer customer){
		try {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println("Succesfully saved : "+customer.getFirstName());
			}
			else {
				System.out.println("Could not saved : "+customer.getFirstName());
			}
			
		}catch(Exception e) {
			System.out.println("Can not access mernis");
			System.out.println(e.getMessage());
		}
		  
	}

	 
}
