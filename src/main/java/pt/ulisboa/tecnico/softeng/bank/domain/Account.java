package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.FenixFramework;

public class Account extends Account_Base {
	
	public Account(double balance, String code, Bank bank) {
		setBalance(balance);
		setCode(code);

		setBank(bank);
	}
	
	public void delete() {
		setBank(null);

		deleteDomainObject();
	}
	
}
