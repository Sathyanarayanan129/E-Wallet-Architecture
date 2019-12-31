package service;
import java.util.Set;

import dao.Ewalletdaoimp;
import entities.CustomerWallet;
import exceptions.InvalidCredentials;

public class EwalletServiceImp implements EwalletService {
	private Ewalletdaoimp dao;
	public EwalletServiceImp(Ewalletdaoimp dao)
	{
		this.dao =dao;
	}		
		public void newCustomer(CustomerWallet c)
		{   if((c.getMobile()).length() == 10)
			dao.addNewCustomer(c);
		else throw new InvalidCredentials("Incorrect Number");
		}
		public void addBalance(CustomerWallet cw, double money)
		{
			dao.addBalance(cw,money);
		}
	    public void transferMoney(CustomerWallet c1,CustomerWallet c2,double money)
	    {
	    	dao.transferMoney(c1,c2,money);
	    }
	    public Set<CustomerWallet> allCustomers() {
	        Set<CustomerWallet> customer = dao.allCustomers();
	        return customer;
	    }

}
