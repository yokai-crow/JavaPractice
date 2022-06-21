import java.util.Scanner;
public class MuseumFair{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
	System.out.println("enter your age: ");
        Integer age = scan.nextInt();
        scan.close();
        Double kid = 0.0;
        Double old = 1.50;
	Double other = 2.50;
        if(age < 5){
		System.out.println("your age is "+age+" so you have to pay $"+kid);
        }else if(age >= 65){
		System.out.println("your age is "+age+" so you have to pay $"+old);
	}else{
		System.out.println("your age is "+age+" so you have to pay $"+other);
	}  
    }
}