import java.util.Scanner;
public class totalaverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student 1:");
		System.out.println("A:");
		int A1=sc.nextInt();
		System.out.println("B:");
		int B1=sc.nextInt();
		System.out.println("C:");
		int C1=sc.nextInt();
		System.out.println("Enter the marks of the student 2:");
		System.out.println("A:");
		int A2=sc.nextInt();
		System.out.println("B:");
		int B2=sc.nextInt();
		System.out.println("C:");
		int C2=sc.nextInt();
		System.out.println("Enter the marks of the student 3:");
		System.out.println("A:");
		int A3=sc.nextInt();
		System.out.println("B:");
		int B3=sc.nextInt();
		System.out.println("C:");
		int C3=sc.nextInt();
		int sum1=A1+B1+C1;
		int sum2=A2+B2+C2;
		int sum3=A3+B3+C3;
		int avg1=sum1=1/3;
		int avg2=sum2=2/3;
		int avg3=sum3=3/3;
		int A_subTotal=A1+B1+C1;
		int B_subTotal=B1+B2+B3;
		int C_subTotal=C1+C2+C3;
		int A_avg=A_subTotal/3;
		int B_avg=B_subTotal/3;
		int C_avg=C_subTotal/3;
		System.out.println("Student 1 total "+sum1+" and average marks"+avg1);
		System.out.println("Student 2 total "+sum2+" and average marks"+avg2);
		System.out.println("Student 3 total "+sum3+" and average marks"+avg3);
		System.out.println("Subject A total "+A_subTotal+"and average marks "+A_avg);
		System.out.println("Subject B total "+B_subTotal+"and average marks "+B_avg);
		System.out.println("Subject C total "+C_subTotal+"and average marks "+C_avg);
	}

}
