package name;

public class CS_202 {
	
	
	public static void main(String[]args) {
		Project_Class obj = new Project_Class(2,2,5.5,4.9);
		System.out.printf("Area: %.2f\n", obj.getArea());
		System.out.println("Perimeter: " + obj.getPerimeter());
		System.out.println("Is the point inside the rectangle? " + obj.contains(3, 3));
		
		System.out.println("Is the second rectangle inside first given rectangle? " + obj.contains(new Project_Class(4,5,10.5,3.2)));
		System.out.println("Does second rectangle overlaps over first rectangle? " + obj.overlaps(new Project_Class(3,5,2.3,5.4)));
		
	}
}

/*
package name;

public class Project_Class{
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	
	public Project_Class() {
		x =0;
		y =0;
		width =1;
		height =1;
	}
	
	
	public Project_Class(double x_Val, double y_Val, double width, double height) {
		this.x = x_Val;
		this.y = y_Val;
		this.width = width;
		this.height = height;
	}
	
	
	// getter and setter method for x coordinate
	public double get_x() {
		return this.x;
	}
	public void set_x(double x) {
		x = this.x;
	}
	
	// getter and setter method for y coordinate
	public double get_y() {
		return this.y;
	}
	public void set_y(double y) {
		y = this.y;
	}
	
	// getter and setter method for width
	public double get_width() {
		return this.width;
	}
	public void set_width(double width) {
		width = this.width;
	}
	
	// getter and setter method for height
	public double get_height() {
		return this.height;
	}
	public void set_height(double height) {
		height = this.height;
	}
	
	// return area of rectangle
	public double getArea() {
		return (this.width * this.height);
	}
	
	// return perimeter of rectangle
	public double getPerimeter() {
		return (2*(width+height));
	}
	
	// This method checks if the given (x,y) is in the rectangle. returns true if it inside 
	public boolean contains(double x, double y) {
		
		return 2*Math.abs(x-this.x)< this.height && 2*Math.abs(y-this.y) < this.width;
	}
	
	public boolean contains(Project_Class r) { // where r is inside rectangle
		return contains(r.get_x(), r.get_y()) && contains(r.get_x() + r.get_height(), r.get_y()+ r.get_width());
	}
	
	public boolean overlaps(Project_Class r) { // check if the given rectangle overlaps the first rectangle
		return contains(r.get_x(), r.get_y()) || contains(r.get_x() + r.get_height(), r.get_y() + r.get_width());
	}
	
}

*/
 // output:

/*
 Area: 26.95
Perimeter: 20.8
Is the point inside the rectangle? true
Is the second rectangle inside first given rectangle? false
Does second rectangle overlaps over first rectangle? false
 */


