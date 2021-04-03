package bankingAssignment;

public class PersonAccount1 {

	private String nameOfAcHolder;
	private String accountNumber;
	private String cardNumber;
	private static double  initialDeposit;
	
	private static double accountBalance;
	private static int pinNumber;
	
	
	public static int getPinNumber() {
		return pinNumber;
	}


	public static void setPinNumber(int pinNumber) {
		PersonAccount1.pinNumber = pinNumber;
	}


	PersonAccount1(String nameAcHolder,String acNumber, String cardNo, int pin){
		nameOfAcHolder=nameAcHolder;
		accountNumber=acNumber;
		cardNumber=cardNo;
		pinNumber=pin;
	}
	
	
public PersonAccount1() {
		// TODO Auto-generated constructor stub
	}
public String accountDetails() {
	
	String accountDetails=getNameOfAcHolder()+", Ac No: "+accountNumber;
	return accountDetails;
}

public String getCardNumber() {
	return cardNumber;
}

public String getNameOfAcHolder() {
	return nameOfAcHolder;
}

public String getAccountNumber() {
	return accountNumber;
}

public double getInitialDeposit() {
	return initialDeposit;
}
public void setNameOfAcHolder(String nameOfAcHolder) {
	this.nameOfAcHolder = nameOfAcHolder;
}
public void setAccountNumber(String next) {
	// TODO Auto-generated method stub
	
}

}

