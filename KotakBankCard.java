public class KotakBankCard implements ATMCard{

	private double balance;

	public void deposit(double amt)
					throws NegativeAmountException{

		if(amt == 0)
			throw new NegativeAmountException(
								"Donot pass Zero ");

		if(amt < 0)
			throw new NegativeAmountException(
								"Donot pass -ve num");
		
		balance = balance + amt;
		System.out.println(amt + " is deposited in Kotak account");
	}

	public void withdraw(double amt)
							throws NegativeAmountException,
										InsufficientFundsException{
		if(amt == 0)
			throw new NegativeAmountException(
								                 "Donot pass Zero ");

		if(amt < 0)
			throw new NegativeAmountException(
								              "Donot pass -ve num");

		if(amt > balance)
			throw new InsufficientFundsException(
												"Insufficient Funds");
		
		balance = balance - amt;
		System.out.println(amt + " is withdraw from Kotak account");
	}

	public void currentBalance(){
		System.out.println("Kotak bank blance: "+ balance);
	}

}









