
public class Armstrongnumber2
{
	public static void main (String[] args)
	{
		for(int k = 100 ; k <= 1000 ; k++)
		{
			int n=k;
			int m=0;
			int s=0;

			while (n>0)
			{
				m=n%10;
				s=s+(m*m*m);
				n=n/10;
			}
			if(k==s)
				System.out.println(k+"is Armstrong Number");
		}
	}
}
