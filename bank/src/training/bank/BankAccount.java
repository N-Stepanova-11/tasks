package training.bank;

public class BankAccount {
	private double balance = 0;
	private final int accountNumber;
	
	public BankAccount(int accountNumber) {
		if (accountNumber<1) {
			throw new IllegalArgumentException("Номер аккаунта не может быть меньше нуля!");
		}
		this.accountNumber = accountNumber;
		
	}
		
	public void deposit(double amount) {
		if (amount<=0) {
			throw new IllegalArgumentException("Ошибка при зачислении средств! Сумма некорректная!");
		}
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if (amount<=0) {
			throw new IllegalArgumentException("Ошибка при снятии средств! Сумма некорректная!");
		}
		if (amount>balance) {
			throw new IllegalStateException("Ошибка! Нельзя списать сумму больше чем остаток!");
		}
		balance-=amount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getInfo() {
		return String.format("Остаток средств на счете %d: %.2f", accountNumber, balance);
	}
}
