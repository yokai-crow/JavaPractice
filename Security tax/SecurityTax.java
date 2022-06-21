import java.util.Scanner;
public class SecurityTax{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you self-employed (Enter 1 for yes, 0 for no) : ");
		Integer yn = scan.nextInt();
		Double min = 67500.0;
		if(yn == 1){
			System.out.println("<Self-Employed>");
			System.out.println("enter your Salary: ");
			Double sal = scan.nextDouble();
			if(sal > min){
				Double ssc = 0.153*min; //ssc:social security tax
				Double rem = sal - min; //remember salary after 67500
				Double med = 0.029*rem; //medicare tax
				Double total = med + ssc; //total security tax
				System.out.println("Your annual earnings: $"+sal);
				System.out.println("Your FICA tax is $"+ssc);
				System.out.println("Your Medicare tax is $"+med);
				System.out.println("Your total security tax is $"+total);
			}else{
				Double ssc = 0.153*sal; //ssc:social security tax
				System.out.println("Your annual earnings: $"+sal);
				System.out.println("Your FICA tax is $"+ssc);
				System.out.println("Your total security tax is $"+ssc);
			}		
		}else if(yn == 0){
			System.out.println("<Employed>");
			System.out.println("enter your Salary: ");
			Double sal = scan.nextDouble();
			if(sal > min){
				Double ssc = 0.0765*min; //ssc:social security tax
				Double rem = sal - min; //remember salary after 67500
				Double med = 0.0145*rem; //medicare tax
				Double total = med + ssc; //total security tax
				System.out.println("Your annual earnings: $"+sal);
				System.out.println("Your FICA tax is $"+ssc);
				System.out.println("Your Medicare tax is $"+med);
				System.out.println("Your total security tax is $"+total);
			}else{
				Double ssc = 0.153*sal; //ssc:social security tax
				System.out.println("Your annual earnings: $"+sal);
				System.out.println("Your FICA tax is $"+ssc);
				System.out.println("Your total security tax is $"+ssc);
			}
		}else{
			System.out.println("read the instruction carefully and  enter carefully!!!");
		}
		 
	}
}