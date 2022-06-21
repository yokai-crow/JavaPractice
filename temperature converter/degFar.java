import java.util.Scanner;
public class degFar{
	static void p(String s){
		System.out.println(s);
	}
	
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		p("input the temperature in farehinheit: ");
		double f = scan.nextDouble();
		scan.close();
		double c = 5*(f - 32)/9; 
		System.out.println(c);
	}
}
