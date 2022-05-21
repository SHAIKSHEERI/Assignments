import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String username="sheerin";
		String password="Maahi";
		String uname,passd;
		int i=1;
		while(i>0) {
			System.out.println("username:");
			uname=sc.next();
			System.out.println("password:");
			passd=sc.next();
			if(username.equals(uname) && password.equals(passd))
			{
				System.out.println("Welcome "+uname);
				break;
			}
			else
			{
				System.out.println("username and password are wrong!re-enter");
				i++;
			}
			if(i>3)
			{
				System.out.println("Contact Admin");
				break;
			}
		}

	}

}
