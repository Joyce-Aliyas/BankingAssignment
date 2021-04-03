package bankingAssignment;

import java.util.Scanner;

public class MainAtmAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM1 A = new ATM1();

		PersonAccount1 person = new PersonAccount1("Joyce", "123456", "1234567891234567", 1122);

		System.out.println("Select the type of banking service,enter either ATM or Online banking or PIN change");
		Scanner scan1 = new Scanner(System.in);
		String transactionType = scan1.next();
		if (transactionType.trim().equalsIgnoreCase("atm")) {
			System.out.println("You have selected ATM transaction");
			System.out.println("Please enter your pin number");
			A.userIdentification();
			//A.transactionOperation(person);
		} else if (transactionType.trim().equalsIgnoreCase("onlinebanking")) {
			System.out.println("You have selected online banking transaction");
		} else if (transactionType.trim().equalsIgnoreCase("PINCHANGE")) {
			System.out.println("You have selected PIN change");
		} else {
			System.out.println("Invalid selection");
		}

	}
}
