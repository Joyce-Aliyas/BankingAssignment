package bankingAssignment;

import java.util.Scanner;

import mypackage.PersonAccountDetails;

public class ATM1 extends BankingRules implements StandardProcess {

	double depositAmount;
	double withdrawAmount;
	static double  dailyWithdrawLimit = 5000;
	int pin;
	int i;
	boolean identity;
	static double balanceAmount;
	PersonAccount1 B= new PersonAccount1();
	//public void transactionOperation(PersonAccount1 person) {
		//}
	
	public void transaction() {
		// balanceAmount=B.getInitialDeposit();
		System.out.println("Select 1 for withdrawal and 2 for deposit and 3 for account balance");
		Scanner scan1 = new Scanner(System.in);
		int i = scan1.nextInt();
		
		switch (i) {
		case 1:withdraw(scan1,balanceAmount);
			
			break;
		case 2:deposit( scan1, balanceAmount);
			
			break  ;
		case 3:

			System.out.println("Your account balance is " + balanceAmount);
			nextTransaction();
						
			break;
			
		default:
			System.out.println("Not a valid selection");
		}

	}
	
	public void withdraw(Scanner scan1,double balanceAmount ) {
		System.out.println("Enter money to be withdrawn");
		withdrawAmount = scan1.nextInt();
		if (withdrawAmount <= balanceAmount && withdrawAmount <= dailyWithdrawLimit) {
			balanceAmount = balanceAmount - withdrawAmount;
			//balanceAmount=B.getInitialDeposit();
			System.out.println("Collect " + withdrawAmount);
			System.out.println("Account balance is " + balanceAmount);
		}
		else if (withdrawAmount > balanceAmount && withdrawAmount < dailyWithdrawLimit) {
			System.out.println("Insufficient balance");
		} 
		else if (withdrawAmount > balanceAmount && withdrawAmount>dailyWithdrawLimit){
			System.out.println("Withdrawal amount should be less than account balance and daily withdrawal limit");
		}
		else if (withdrawAmount <= balanceAmount && withdrawAmount > dailyWithdrawLimit){
			System.out.println("Withdrawal amount is more than daily limit");
	}
		else {nextTransaction();
			
		}
		
		}

		public void deposit(Scanner scan1,double balanceAmountJoyce ) {
			System.out.println("Enter money to be deposited");
			depositAmount = scan1.nextInt();
			balanceAmount = balanceAmount + depositAmount;
			//balanceAmount=B.getInitialDeposit();
			System.out.println("Leftover deposit is " + balanceAmount);
			nextTransaction();
			
				}
		@Override
		public void fundTransfer() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void investment() {
			// TODO Auto-generated method stub
			
		}
		@Override
		
		public void userIdentification() {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			pin = scan.nextInt();
					if (pin == B.getPinNumber()) {
						identity=true;
						System.out.println("Pin verified");
						transaction();
					}
					else {System.out.println("Incorrect pin, please enter correct pin");
					}
		}
					public void nextTransaction() {		
						
						System.out.println("Do you want to do another transaction. Type Yes or No");
						Scanner scan=new Scanner(System.in);
						String anotherTxn =scan.next();
								
						if (anotherTxn.trim().equalsIgnoreCase("yes")) {
							transaction();
						}
						else {System.out.println("Exit");
					
		}

					}
}
			
		
