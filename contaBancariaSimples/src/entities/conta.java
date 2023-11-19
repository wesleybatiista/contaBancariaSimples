package entities;

public class conta {
	
	public double balance;
	public int accountNumber;
	public String client;
	public String initialDeposit;
	public double valueDeposit;
	public double withdraw;
	
public void addValue(double valueDeposit) {
	balance += valueDeposit;
	}

public void withValue(double withdraw) {
	balance -= withdraw + 5.00;
}

public String toString() {
	return "Account: " + accountNumber + ", Holder: " + client +", Balance: " + String.format("%.2f", balance);
}
}
