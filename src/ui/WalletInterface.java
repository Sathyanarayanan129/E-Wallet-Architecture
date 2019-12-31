package ui;
import entities.CustomerWallet;
import java.util.*;
import dao.Ewalletdaoimp;
import service.EwalletServiceImp;
public class WalletInterface {
    private EwalletServiceImp service = new EwalletServiceImp(new Ewalletdaoimp());
    
	public static void main(String[] args) {
		WalletInterface wi = new WalletInterface();
		wi.execute();
		
	}
	public void execute()
	{
		try
	{
		
		 CustomerWallet cw1 = new CustomerWallet("2348424809","Sathya",12000);
		 CustomerWallet cw2 = new CustomerWallet("9872340812","Aswin",90900);
		 service.newCustomer(cw1);
		 service.newCustomer(cw2);
		 service.addBalance(cw1,1000);
		 service.transferMoney(cw1,cw2,1200);
		 Set<CustomerWallet> set= service.allCustomers();
		 print(set);
	
	}
	catch(Exception e)
		{
     System.out.println("Something went wrong");
		}
	}
	 public void print(Collection<CustomerWallet> customers)
	 {
	        for (CustomerWallet customer:customers)
	            System.out.println(customer.toString());
	        
}
}
