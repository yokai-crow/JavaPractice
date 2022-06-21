import java.util.Scanner;
public class WageCalculator{
	static void p(String s){
		System.out.println(s);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		p("Your wages subject to Social Security Tax are :  $");
		double wage = scan.nextDouble();
		scan.close();
		double tax;
		double maxWage = 57600.00;
		if(wage <= 57600){
			tax = 0.124 * wage;
			System.out.println("your security tax is $"+tax);
		}else{
			tax = 0.124 * maxWage;
			System.out.println("your security tax is $"+tax);
		}	
	}
}