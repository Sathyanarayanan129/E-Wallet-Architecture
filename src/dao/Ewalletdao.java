package dao;

import java.util.Set;

import entities.CustomerWallet;

public interface Ewalletdao {
	void newCustomer(CustomerWallet cw);
    void addBalance(CustomerWallet cw,double amount);
    void transferMoney(CustomerWallet c1,CustomerWallet c2,double money);
    Set<CustomerWallet> allCustomers();
} 
