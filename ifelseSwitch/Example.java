import java.util.Scanner;
public class Example{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("i am am daami: yes or no? ");
		String a = scan.next();
		
		//System.out.print(a);
		if(a.equals("yes")){    //variable.equals("value to be compared")
			System.out.print("Success");
			System.out.print("malai thaxa ma daami ho aba tero naam van: ");
			String name = scan.next();
			System.out.println("Are you he or she? [1: he  2: she]");
			int choice = scan.nextInt();
			switch(choice){
				case 1: System.out.println("what's up mr "+name+".");
					scan.close();
					break;
				case 2: System.out.println("what's up miss "+name+".");
					scan.close();
					break;
				default: System.out.println("what's up "+name+".");
					scan.close();
					break;
			}
			
			
			scan.close();			

		}else{
			scan.close();
			int i=0;
			for(i=0;i<100;i++){
				//i+=1;
				//System.out.print("hi");
				//System.out.print(i);
			}
			//System.out.print(a);
			System.out.print(a);
		}
	
	
	}



}