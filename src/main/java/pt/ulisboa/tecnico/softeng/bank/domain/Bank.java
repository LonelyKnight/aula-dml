package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.FenixFramework;

public class Bank extends Bank_Base {

	public Bank(String name, String code) {
		setName(name);
		setCode(code);

		FenixFramework.getDomainRoot().addBank(this);
	}

	public void delete() {
		setRoot(null);
		
		for (Account account : getAccountSet()) {
			account.delete();
		}
		
		deleteDomainObject();
	}

	public static Bank getBankByCode(String code) {
		for (Bank bank : FenixFramework.getDomainRoot().getBankSet()) {
			if (bank.getCode().equals(code)) {
				return bank;
			}
		}
		return null;
	}
	public Account getAccount(String code) {
		for (Account account : getAccountSet()) {
			if (account.getCode().equals(code)) {
				return account;
			}
		}
		return null;
	}

}
