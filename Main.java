package interfacesAbstracts;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Abdulaziz","Bardakçýoðlu",1996,"12345678910"));
	}

}
