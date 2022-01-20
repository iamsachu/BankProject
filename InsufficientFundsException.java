//InsufficientFundsException.java 
class  InsufficientFundsException extends Exception{
	InsufficientFundsException(){ 
		super();
	}

	InsufficientFundsException(String errMsg){ 
		super(errMsg); 
	} 

	InsufficientFundsException(Exception e){
		super(e);		
	}
}
