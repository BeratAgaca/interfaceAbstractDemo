package Adapters;

import java.rmi.RemoteException;

 

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class MerniceServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception{
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
	}

}
