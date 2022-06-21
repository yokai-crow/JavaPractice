import java.util.Scanner;
public class Coinvalue{
    public static void main(String arg[]){
        int total = 0;
        Scanner scan = new Scanner(System.in);
	int a;
	for(a=1;1==1;a++){ //using for loop
	//while(true){ //using while loop
        //do{ //using do...while loop
            System.out.println("\n\n\n\n\n\t\t\t\t	 currency count in cents \n\nEnter the type of currency you have\n\n1. Half dollar \t 2. Quarter\t3. Dime \t4. Nickel \t5. exit\n");
            Integer cho = scan.nextInt();
            System.out.println("\nenter quantity: ");
            Integer quant = scan.nextInt();   
            int current = 0; 
            switch(cho){
                case 1:
                    current = quant * 50;
                    break;
                case 2:
                    current = quant * 25;
                    break;
                case 3:
                    current = quant * 10; 
                    break;
                case 4:
                    current = quant * 5;
                    break;
		case 5: System.out.println("Thanks for using this application."); 
		        scan.close();
		        return;
                default:System.out.println("Invalid option!!");
                    break;
            }
            total = total + current;
            System.out.println("the total currency you have is "+total+" cents.");
            System.out.println("\n\n\nDo you want to continue? [y|n]: ");
            String choice = scan.next();
	    switch(choice){
		case "y":break;
		case "n": System.out.println("Thanks for using the application.");
			  scan.close();
			  return;
		default:System.out.println("error");  
			break;
	    }

//kina compare vayena string if elae use garda
/*
            if(choice == "y"){
                continue;
            }else if(choice == "n"){
                scan.close();
                return;
            }else{
                System.out.println("error");
            }
*/
        }//while(true);//for do...while loop
        
    }

}