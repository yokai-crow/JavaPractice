
public class RectrangleUser{
	public static void main(String args[]){
		Rectrangle r1 = new Rectrangle();
		//r1.setHeight(4.0); r1.setWidth(9.0);
		System.out.println("Area: "+ r1.getArea());

		System.out.println("perimeter: " + r1.getPerimeter());
		Rectrangle r2 = new Rectrangle(20.5, 42.7, "red");
		System.out.println("Area: " + r2.getArea());
		
		
	}
}

class Rectrangle{
	double width;
	double height;
	static String color;

	Rectrangle(){
		height = width = 0.0;
		color = "green";
	}
	//constructor
	Rectrangle(double h, double w, String c){
		height = h; width = w; color  =c;
	}

	public void setHeight(double h){height = h;}
	public void setWidth(double w){width = w;}
	public void setColor(String c){color = c;}
	public double getHeight(){return height;}
	public double getWidth(){return width;}
	public String getColor() {return color;}
	public double getArea(){return height*width;}
	public double getPerimeter(){return 2*(height+width);}

}

