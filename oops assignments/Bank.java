
public class Bank {


	public void Savingsaccount()
	{
		System.out.println("Savings account"+"Fixed deposit");

	}
	public void Currentaccount()
	{
		System.out.println("Current account"+"Cash credit");
	}
	public class mainclass{
		static void findBalance(int x, float bal)
		{
		 
		   
		    if (x % 10 == 0 && ((float)x + 1.50) <= bal)
		    {
		 
		       
		        System.out.printf("%.2f\n", bal - x - 1.50);
		    }
		    else
		    {
		 
		        
		        System.out.printf("%.2f\n", bal);
		    }
		}
		 
		
		public static void main(String[] args)
		{
		    int x = 50;
		    float bal = (float) 100.50;
		 
		    findBalance(x, bal);
		}
		}
}