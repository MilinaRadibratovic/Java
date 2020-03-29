package bankatest;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	public Account openAccount(String name) {
		Account account = new Account(name);
		accounts.add(account);
		return account;
	}

	public void closeAccount(Account account) {
		accounts.remove(account);
	}

	public boolean transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
		Account from = getAccount(accountNumberFrom);
		Account to = getAccount(accountNumberTo);
		if (amount > 0 && amount < from.getAmount()) {
			if (from != null)
				  from.setAmount(from.getAmount()-amount);
			if (to != null)
			 to.setAmount(to.getAmount()+amount);
		}
		return true;
	}

	public void payInMoney(String accountNumber, Double amount) {
		Account account = getAccount(accountNumber);
		if (amount > 0)
			account.setAmount(account.getAmount() + amount);

	}

	public Account getAccount(String accountNumber) {
		for (Account acc : accounts)
			if (acc.getNumber() == accountNumber)
				return acc;

		return null;
	}

	public Double getSumMoney() {
		Double res = 0d;
		for (int i = 0; i < accounts.size(); i++) {
			res += accounts.get(i).getAmount();
		}
		return res;
	}

	public void reset() {
		accounts.clear();
	}

}
