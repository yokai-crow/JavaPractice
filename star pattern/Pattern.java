import java.util.Scanner;
public class Pattern{
	//methods
	static void p(String s){
		System.out.println(s);
	}
	//main code starts
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		do{
			p("\t\t\t\tSimple Pattern Application\n");
			p("0. exit\t1. pattern1\t2. pattern2\t3. pattern3\n");
			System.out.print("Options: ");
			Integer choice = scan.nextInt();
			switch(choice){
				case 0: scan.close();
					return;
				case 1:	//int n = scan.nextInt();
						pattern1(4);
					break;
				case 2: pattern2(5);
					break;
				case 3: pattern3(5);
					break;
				default: p("Invalid option");
					break;
			}
		}while(true);	
	}
	//methods start
	static void pattern1(int n){
		int a, i;
		for(i=1;i<=n;i++){
			//for every row run the column
			for(a=1;a<=i;a++){
				System.out.print("* ");	
			}
			//when one row is printed we need to add a new line
			System.out.println();
		}
	}
	static void pattern2(int n){
		for(int i=1;i<=n;i++){
			for(int a=1;a<=n;a++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n){
		for(int i=1;i<=n;i++){
			for(int a=1;a<=n+1-i;a++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//methods end
}