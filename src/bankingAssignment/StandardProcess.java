package bankingAssignment;

import java.util.Scanner;

public interface StandardProcess {

	public void fundTransfer();
	public void investment();
	public void deposit(Scanner scan1, double balanceAmount);
	public void withdraw(Scanner scan1, double balanceAmount);
}
