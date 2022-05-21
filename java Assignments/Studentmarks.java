import java.util.Scanner;
public class Studentmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first subject marks:");
		int sub1=sc.nextInt();
		System.out.println("Enter the second subject marks:");
		int sub2=sc.nextInt();
		System.out.println("Enter the third subject marks:");
		int sub3=sc.nextInt();
		if(sub1>=60 && sub2>=60 && sub3>=60)
		{
			System.out.println("Pass");
		}
		if((sub1>=60 && sub2>=60) || (sub2>=60 && sub3>=60) || (sub3>=60 && sub1>=60));
		{
			System.out.println("promoted");
		}
		if((sub1<60 && sub2<60 && sub3<60) ||(sub1>60 || sub2>60 || sub3>60));
		{
			System.out.println("fail");
		}
	}
}



