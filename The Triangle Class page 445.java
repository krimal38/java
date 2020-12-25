package name;
import java.util.*;
public class CS_202 {
	
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the color: ");
		String color = scn.nextLine();
		System.out.println("Enter value for side1:");
		double side1 = scn.nextDouble();
		System.out.println("Enter value for side2:");
		double side2 = scn.nextDouble();
		System.out.println("Enter value for side3:");
		double side3 = scn.nextDouble();
		System.out.println("Enter if the color is filled or not. If filled, enter true and if no filled, enter false:");
		boolean filled = scn.nextBoolean();
		
		Project_Class obj = new Project_Class(color, filled, side1, side2, side3);
		
		
		System.out.println(obj.toString());
		
		System.out.println("Area: "+ obj.getArea());
		System.out.println("perimeter: " + obj.getPermimeter());
		
	}
}	

// Triangle class. Sub class of GeometricObject class
/*
 package name;

 class Project_Class extends AnotherClass{
	
	private double side1=1;
	private double side2=1;
	private double side3=1;
	
	
	public Project_Class() {
	
	}
	
	public Project_Class(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Project_Class( String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	
	public double getside1() {
		return side1;
	}
	
	public double getside2() {
		return side2;
	}
	
	public double getside3() {
		return side3;
	}
	
	public double getArea() {
		double side4 = (side1+side2+side3)/2;
		
		return Math.sqrt(side4*(side4-side1) * (side4-side2) * (side4-side3));
	}
	
	public double getPermimeter() {
		return (side1+side2+side3);
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Traingle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}
	
	
}

 */

// GeomerticObject which is the superclass.

/*
 package name;

 public class AnotherClass {
	
	private String color;
	private boolean filled;
	
	/*
	  If a constructor does not explicitly invoke a superclass constructor,the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
	   If the super class does not have a no-argument constructor, you will get a compile-time error.
	    Object does have such a constructor, so if Object is the only superclass, there is no problem.
	 */
/*
	public AnotherClass() {
		
	}
	
	public AnotherClass(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean Filled) {
		this.filled = Filled;
	}
	
	
	@Override
	public String toString() {
		return "Color is " + this.color + ". Filled: " + this.filled;
	}
	 
	 
 }	

 */



// output 

/*
 Enter the color: 
blue
Enter value for side1:
29
Enter value for side2:
38
Enter value for side3:
28
Enter if the color is filled or not. If filled, enter true and if no filled, enter false:
true
Color is blue. Filled: true. Traingle: side1 = 29.0 side2 = 38.0 side3 = 28.0
Area: 403.4704914860565
perimeter: 95.0

 */






























