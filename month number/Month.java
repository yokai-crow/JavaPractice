import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Month{
	//this is the function creation also known as method in java
	static void p(String s){
		System.out.println(s);
	}
	//uses bufferreader to take input from keyboard in string form
	public static void main(String args[]) throws IOException{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("input month you want to know: ");
		String name = br.readLine();
		//p("you typed:"+name);
		switch(name){
			case "1": p("jan");
				break;
			case "2": p("Feb");
				break;
			case "3": p("Mar");
				break;
			case "4": p("Apr");
				break;
			case "5": p("May");
				break;
			case "6": p("Jun");
				break;
			case "7": p("Jul");
				break;
			case "8": p("Aug");
				break;
			case "9": p("Sep");
				break;
			case "10": p("Oct");
				break;
			case "11": p("Nov");
				break;
			case "12": p("Dec");
				break;
			default: p("invalid");
				break;
		}
		//Scoretest();	
	}
}
