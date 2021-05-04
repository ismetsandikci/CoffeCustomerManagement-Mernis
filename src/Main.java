import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Ýsmet","Sandýkçý",LocalDate.of(1994, 12, 8),"52609543396");
		Customer customer2 = new Customer(2,"Test","Müþteri",LocalDate.of(1993,2,11),"12345678901");
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);
	}

}
