package name;

public class CS_202 {
	

	public static void main(String[]args) {
	
		Project_Class obj = new Project_Class();
		System.out.println("Default: Coordinate points (" + obj.getx() + "," + obj.gety() + ")" + " and (" + obj.getX() + "," + obj.getY() + ")");
		System.out.println();
		
		Project_Class obj1 = new Project_Class(2,5,20,30.5);
		System.out.println("Coordinate points (" + obj1.getx() + "," + obj1.gety() + ")" + " and (" + obj1.getX() + "," + obj1.getY() + ")");
		System.out.printf("The distance between points is %.2f\n", obj1.distance());
		System.out.println("Using distance formula to find the distance between two coordinates. Tha value is: " + obj.distance_using_coordinate());
		
	}
}	




/*
 package name;

public class Project_Class {

	private double x;
	private double y;
	private double X;
	private double Y;
	
	
	public Project_Class() {
			x =0;
			y =0;
			X =0;
			Y =0;
	}
	
	public Project_Class(double x, double y, double X, double Y) {
		this.x = x;
		this.y = y;
		this.X = X;
		this.Y = Y;
	}
	
	
	public double getX() {
		return this.X;
	}
	public double getY() {
		return this.Y;
	}
	public double getx() {
		return this.x;
	}
	
	public double gety() {
		return this.y;
	}
	
	
	
	public double distance() {
		double Xval = getX();
		double Yval = getY();
		double xval = getx();
		double yval = gety();
		
		double Distance_between_two_xValues = Math.abs(Xval - xval);
		double Distance_between_two_yValues = Math.abs(Yval - yval);
		
		return Math.hypot(Distance_between_two_yValues, Distance_between_two_xValues);
		
	}
	
	public double distance_using_coordinate() {
		double x1 = getx();
		double y1 = gety();
		double x2 = getX();
		double y2 = getY();
		
		double compute_square_forX = Math.pow((y2-y1), 2);
		double compute_square_forY = Math.pow((x2-x1),2);

		return Math.sqrt(compute_square_forX + compute_square_forY);
		
		
	}
		
}

 */

// output of this code. I still have to add more print statements. 
/*
 Default: Coordinate points (0.0,0.0) and (0.0,0.0)

Coordinate points (2.0,5.0) and (20.0,30.5)
The distance between points is 31.21
Using distance formula to find the distance between two coordinates. The value is: 0.0

 */


