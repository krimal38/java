package name;

public class CS_202 {
	

	public static void main(String[]args) {
	
		Project_Class obj = new Project_Class();
		System.out.println("The default side is " + obj.getside() + ".Default length is " + obj.getLength());
		System.out.println("Default perimeter is " + obj.getParimeter() + ".Default area is " + obj.getArea() + " which is centered at (" + obj.getx() +","+ obj.gety() + ")");
		System.out.println();
		
		
		Project_Class obj1 = new Project_Class(6,4);
		System.out.println("The side is " + obj1.getside() + ".Length is " + obj1.getLength());
		System.out.println("Perimeter is " + obj1.getParimeter() + ".Area is " + obj1.getArea() + " which is centered at (" + obj1.getx() +","+ obj1.gety() + ")");
		System.out.println();
		
		Project_Class obj2 = new Project_Class(10,4,5.6,7.8);
		System.out.println("The side is " + obj2.getside() + ".Length is " + obj2.getLength());
		System.out.println("Perimeter is " + obj2.getParimeter() + ".Area is " + obj2.getArea() + " which is centered at (" + obj2.getx() +","+ obj2.gety() + ")");
		
		
	}
	
}
/*
 package name;

public class Project_Class {

	private int numOfSide =3;
	private double lengthOfTheSide =1;
	private double x =0;
	private double y =0;
	
	final double PI = Math.PI;
	
	Project_Class(){
		
	}
	
	Project_Class(int side, double length){
		this.numOfSide = side;
		this.lengthOfTheSide = length;
	}
	
	Project_Class(int side, double length, double xVal, double yVal){
		 this.numOfSide = side;
		 this.lengthOfTheSide = length;
		 this.x = xVal;
		 this.y = yVal;
		
	}
	
	public int getside() {
		return this.numOfSide;
	}
	public void setSide(int side) {
		side = this.numOfSide;
	}

	
	public double getLength() {
		return this.lengthOfTheSide;
	}
	
	public void setLength(double length) {
		length = this.lengthOfTheSide;
	}
	
	
	public double getx() {
		return this.x;
	}
	
	public void setx(double  xValue) {
		xValue = this.x;
	}
	
	public double gety() {
		return this.y;
	}
	
	public void sety(double  yValue) {
		yValue = this.y;
	}
	
	
	// To get the perimeter of any polygon add the lengths of its sides
	public double getParimeter() {
		int side = getside();
		double length = getLength();
		double sum =0;
		for(int i =0; i<side; i++) {
			
			sum += length;
		}
		return sum;
	}
	
	public double getArea() {
		int side = getside();
		double length = getLength();
		
		double a = side * (length*length);
		double b = Math.tan(PI/side);
		
		double area = a/(4*b);
		return area;
	}
}

 */


// output

/*
 * The default side is 3.Default length is 1.0
Default perimeter is 3.0.Default area is 0.43301270189221946 which is centered at (0.0,0.0)

The side is 6.Length is 4.0
Perimeter is 24.0.Area is 41.569219381653056 which is centered at (0.0,0.0)

The side is 10.Length is 4.0
Perimeter is 40.0.Area is 123.10734148701015 which is centered at (5.6,7.8)
 */





