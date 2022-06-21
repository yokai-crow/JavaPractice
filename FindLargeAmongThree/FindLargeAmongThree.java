import java.util.Scanner;
public class FindLargeAmongThree{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number to compare: ");
		double x = scan.nextDouble();
		System.out.println("enter second number to compare: ");
		double y = scan.nextDouble();
		System.out.println("enter third number to compare: ");
		double z = scan.nextDouble();
		scan.close();
		if(x>y && y>z){
			System.out.println(x+" is greater than "+y +"and "+z);
		}else if(y>z && z > x){
			System.out.println(y+" is greater than "+x +"and "+z);
		}else if(z>y && y>x){
			System.out.println(z+" is greater than "+y +"and "+x);
		}else if(x == y && y == z){
			System.out.println(x+", "+y+" and "+z+" are equal.");
		}else{
			System.out.println("error");
		}

	}
}