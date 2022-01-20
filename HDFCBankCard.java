public class HDFCBankCard implements ATMCard{

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
		System.out.println(amt + " is deposited in HDFC account");
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
		System.out.println(amt + " is withdraw from HDFC account");
	}

	public void currentBalance(){
		System.out.println("HDFC bank blance: "+ balance);
	}

}









