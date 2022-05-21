import java.util.Scanner;
class main{
	public class simplecompoundinterest {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the principle: ");
			Double principle = input.nextDouble();
			System.out.println("Enter the rate: ");
			Double rate = input.nextDouble();
			System.out.println("enter the time: ");
			Double time = input.nextDouble();
			Double interest = (principle*rate*time)/100;
			System.out.println("principle: "+principle);
			System.out.println("interest rate: "+rate);
			System.out.println("tme duration: "+time);
			System.out.println("Simple interest: "+interest);
			input.close();



}

}
}