import java.util.Scanner;
public class FindLargeNum{
	public static void main(String arg[]){
		System.out.println("input your number: ");
		Scanner scan = new Scanner(System.in);
		Double num1 = scan.nextDouble();
		System.out.println("input second number: ");
		Double num2 = scan.nextDouble();
		scan.close();
		if(num1 < num2){
			System.out.println(num2 + " is greater than "+num1);
		}else if(num1 > num2){
			System.out.println(num1 + " is greater than "+num2);
		}
	}
}