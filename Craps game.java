import java.util.*;
public class Project {

	public static void main(String[] args) {

	Scanner scn = new Scanner (System.in);
	System.out.println("Enter three points for p0, p1, and p2: ");
	double one = scn.nextDouble();
	double two = scn.nextDouble();	
	double three = scn.nextDouble();	
	double four = scn.nextDouble();
	double five = scn.nextDouble();	
	double six = scn.nextDouble();
		
		boolean LeftHandSide = leftOfTheLine(one,two,three,four,five,six);
		boolean OnTheLineSegment = OnTheLineSegment(one,two,three,four,five,six);
		boolean OnTheSameLine = OnTheSameLine(one,two,three,four,five,six);
		
	
	if(LeftHandSide == true)
		System.out.println("(" +five + "," + six + ")" + " is on the left side of the line from  " + "(" +  one + "," + two + ")" + " to " + "(" + three + "," + four + ")");
	else if( OnTheLineSegment == true)
		System.out.println("(" +five + "," + six + ")" + " is on the line segment from  " + "(" +  one + "," + two + ")" + " to " + "(" + three + "," + four + ")");
	
	else if(OnTheSameLine == true)
		System.out.println("(" +five + "," + six + ")" + " is on the same line from  " + "(" +  one + "," + two + ")" + " to " + "(" + three + "," + four + ")");
	 
	 else
		System.out.println("(" +five + "," + six + ")" + " is on the right side of the line from  " + "(" +  one + "," + two + ")" + " to " + "(" + three + "," + four + ")");
	}
	
	
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
		// returns true if points (x2,y2) is on the left side.
		double calculate = (((x1-x0)*(y2-y0)) - ((x2-x0)* (y1-y0)));
		
		if(calculate > 0) 
			return true;
		else 
			return false;
	}
	
	
	public static boolean OnTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
		// have to make changes in this method.
		double CalculateLineSegment = ((x0+x1)/2);
		double CalculateLineSegmentAgain = ((y0+y1)/2);
		
		if(CalculateLineSegment == x2 && CalculateLineSegmentAgain == y2) return true;
		else 
			return false;
		
	}
	
	public static boolean OnTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
		double calculate = (((x1-x0)*(y2-y0)) - ((x2-x0)* (y1-y0)));
		
		if(calculate ==0) return true;
		else 
			return false;
		
	}
			
}

	


