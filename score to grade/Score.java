import java.util.Scanner;
public class Score{
	static void p(String s){
		System.out.println(s);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); //reads the input provided by user
		p("enter your marks: ");
		int marks = scan.nextInt(); //reads the number provided by user through keyboard
		scan.close(); //should close the scanner after use			
		if(marks < 40){
			p("you failed");
		}else if(marks < 50 && marks > 39){
			p("congratulations!!, You got D");
		}else if(marks < 60 && marks > 49){
			p("congratulations!!, You got C");	
		}else if(marks < 70 && marks > 59){
			p("congratulations!!, You got B");	
		}else if(marks > 69 && marks < 90){
			p("congratulations!!, You got A");
		}else if(marks > 89 && marks < 101){
			p("congratulations!!, You got A+");
		}else{
			p("invalid marks");
		}
	}
}