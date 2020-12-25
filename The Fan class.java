package name;

public class CS_202 {
	
	public static void main(String[] args) {
	
		
		Project_Class obj2 = new Project_Class(3 ,10 ,"yellow" ,true);
		
		String str1 = obj2.toString();
		System.out.println(str1);
		System.out.println();
		
		
		Project_Class obj3 = new Project_Class(2 ,5,"blue",false);
		String str2 = obj3.toString();
		System.out.println(str2);
	}
}



/*
package name;

public class Project_Class {

	static final int SLOW =1;
	static final int MEDIUM =2;
	static final int FAST =3;
	
	
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	
	
	Project_Class(){
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	
	Project_Class(int Speed, double Radius, String Color, boolean ON_OFF){
		 this.speed = Speed;
		 this.on = ON_OFF ;
		this.radius = Radius;
	 this.color = Color;
	}

	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		speed = this.speed;	
	}

	
	public boolean getOn() {
		return on;
	}
	public void setOn(boolean On) {
			On = this.on; 
				
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double Radius) {
		Radius = this.radius;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		color = this.color;
	}
	
	
	public String toString() {
		boolean On = getOn();
		String description = " ";
		
		if(On == true) {
			description += "The speed of the fan is " + this.speed
					+ ", the color of the fan is " + color
					+ ", and the radius of the fan is " + radius + " ."; 
		
			
		}else
		{
			description += "The color of the fan is " + this.color
					+ ", the radius of the fan is "  + this.radius
					+ ", fan is off.";
			
		}
		return description;
	}
		
}
   
*/


// result
/*
 The speed of the fan is 3, the color of the fan is yellow, and the radius of the fan is 10.0 .

 The color of the fan is blue, the radius of the fan is 5.0, fan is off.
 */










