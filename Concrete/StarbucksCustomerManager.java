package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer)){
			super.Save(customer);
		}else {
			System.out.println("Wrong entry");
		}		
	}
	
}
