import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	//Senaryo: Kahve dükkanları için müşteri yçnetimi yapan bir sistem yazmak istiyoruz.
	// Starbuck ve Nero firmasoı için çalışıyoruz
	//iki firmada müşterilerini veri tabanına kaydetmek istiyor
	// Starbucks müşterileri kaydederken, mutlaka mernis doğrulaması istiyor
	//nero müşterileri için böyle bir şey istemiyor
	//starbucks müşteriler için her kahve alımında yıldız kazandırmak istiyor.

	
	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapters());


		Customer customer = new Customer(1,"Berat","Agaca",2001,"28483169236");
		customerManager.Save(customer);
		 

	}

}
