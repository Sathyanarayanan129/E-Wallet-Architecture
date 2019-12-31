package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.CustomerWallet;

public class Ewalletdaoimp implements Ewalletdao {

	public Ewalletdaoimp() {
		// TODO Auto-generated constructor stub
	}
	private Map<String,CustomerWallet> store = new HashMap<>();
	
	public void addNewCustomer(CustomerWallet cw)
	{
		store.put(cw.getMobile(),cw);
	}
	public void addBalance(CustomerWallet cw,double amount)
	
	{
		cw.addAmount(amount);
	}
	public void transferMoney(CustomerWallet c1,CustomerWallet c2,double money)
	{
		double balance1,balance2;
		balance1 = c1.getBalance();
		balance2 = c2.getBalance();
		c2.setBalance(balance2+money);
		c1.setBalance(balance1-money);
	}
	
	public Set<CustomerWallet> allCustomers()
	{
		Collection<CustomerWallet> collect = store.values();
		Set<CustomerWallet> set = new HashSet<>(collect);
		return set;
	}
		

}

