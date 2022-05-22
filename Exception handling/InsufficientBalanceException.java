
public class InsufficientBalanceException extends Exception {
	void withdraw (double amount) throws InsufficientBalanceException
	{
	    double balance = 0;
		if (amount > balance)
	        throw new InsufficientBalanceException();
	    else
	        balance -= amount;
	}


}
