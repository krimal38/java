package name;

public class CS_202 {
	
	
	public static void main(String[]args) {
		
		
		String name = "Kshitiz";
		String address = "2561 Farmcrest Dr.";
		String number = "703-608-3719";
		String email = "kshitizrimal@gmail.com";
		double salary = 2000.45;
		String office = "Tekzima";
		String status = "Sophomore";
		String title = "Administrator";
		double hour = 8.5;
		String rank = "high";
		
		Project_Class obj_person = new Project_Class();
		obj_person.setname(name);
		obj_person.setaddress(address);
		obj_person.setNum(number);
		obj_person.setEmail(email);
		System.out.println(obj_person.toString());
		System.out.println();
		
		AnotherClass StudentClass = new AnotherClass(name,address,number,email, status);
		System.out.println(StudentClass.toString());
		System.out.println();
		

		Employee EmployeeClass = new Employee(name, address, number, email, salary, office);
			System.out.println(EmployeeClass.toString());
			System.out.println();
			
		Staff staffClass = new Staff(name, address, number, email, salary, office, title);	
		System.out.println(staffClass.toString());
		System.out.println();
			
		Faculty FacultyClass = new Faculty(name, address, number, email, salary, office, hour,  rank);
		System.out.println(FacultyClass.toString());
		
       
      
    }
	
}

// Person class
/*
 package name;


// This is considered as Person class

 public class Project_Class{
	
	private String name;
	private  String address;
	private String phoneNum;
	private  String email;
	 
	public Project_Class() {
		name = " ";
		address = " ";
		phoneNum = " ";
		email = " ";
	}
	
	public Project_Class(String name, String address, String phoneNum, String email) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	
	public String getname() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getaddress() {
		return this.address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getNum() {
		return this.phoneNum;
	}
	public void setNum(String num) {
		this.phoneNum = num;
	}
	
	
	public String getemail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return " Name:" + getname() + "\n Address: " + this.getaddress() + "\n Phone Number: " + this.getNum() + "\n Email: " + this.getemail();
	}
	
}

 */

// student class
/*
 package name;

// This is considered as student class

 public class AnotherClass extends Project_Class{
	 
	 public static final String Freashman = "Freashman";
	 public static final String Sophomore = "Sophomore";
	 public static final String Junior = "Junior";
	 public static final String Senior = "Senior";
	 private String status;
	 
	 public AnotherClass(String status) {
		 this.status = status;
	 }
	 public AnotherClass(String name, String address, String phoneNum, String email, String status) {
		 super (name, address, phoneNum, email);
		 this.status = status;
	 }
	 
	
	 
	 @Override
	 public String toString() {
		 return super.toString() + "\n Status: " + this.status;
	 }
	 
	 
 }

 */

// Faculty class
/*
 package name;

public class Faculty extends Employee {
	private double officeHour;
	private String rank;

		
	
	public Faculty(String name, String address, String phoneNum, String email, double salary, String office, double hour, String rank) {
		super(name, address, phoneNum, email, salary, office);
		this.officeHour = hour;
		this.rank = rank;
	}
	
	public double getOfficeHour() {
		return this.officeHour;
	}
	public void setofficeHour(double hour) {
		this.officeHour = hour;
	}
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "\n office hour: " + getOfficeHour() + " hours " + "\n Rank: " + getRank();
	}
	
	
}
 */

// Staff class
/*
 package name;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, String address, String phoneNum, String email, double salary, String office, String title) {
		super(name, address, phoneNum, email, salary, office);
		this.title = title;
	}
	
	public String title() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Title: " + title();
	}
		
}

 */

// Employee class
/*
 package name;

public class Employee extends Project_Class{
	
	private double salary;
	private java.util.Date dateCreated;
	String office;
	
	
	
	public Employee() {
		dateCreated = new java.util.Date();
		this.salary = 0.0;
		this.office = " ";
	}
	public Employee(String name, String address, String phoneNum, String email, double salary, String office) {
		super(name, address, phoneNum, email);
		this.salary = salary;
		this.office = office;
		dateCreated = new java.util.Date();
	}
	
	public Employee( double salary, String office) {
		this.salary = salary;
		this.office = office;
		dateCreated = new java.util.Date();
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getoffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n Salary: $" + getSalary() + "\n Office: " + getoffice() + "\n Date: " + this.dateCreated;
	}
		
}
 */



// output
/*
 Name:Kshitiz
 Address: 2561 Farmcrest Dr.
 Phone Number: 703-608-3719
 Email: kshitizrimal@gmail.com

 Name:Kshitiz
 Address: 2561 Farmcrest Dr.
 Phone Number: 703-608-3719
 Email: kshitizrimal@gmail.com
 Status: Sophomore

 Name:Kshitiz
 Address: 2561 Farmcrest Dr.
 Phone Number: 703-608-3719
 Email: kshitizrimal@gmail.com
 Salary: $2000.45
 Office: Tekzima
 Date: Tue Jan 08 00:28:45 EST 2019

 Name:Kshitiz
 Address: 2561 Farmcrest Dr.
 Phone Number: 703-608-3719
 Email: kshitizrimal@gmail.com
 Salary: $2000.45
 Office: Tekzima
 Date: Tue Jan 08 00:28:46 EST 2019
 Title: Administrator

 Name:Kshitiz
 Address: 2561 Farmcrest Dr.
 Phone Number: 703-608-3719
 Email: kshitizrimal@gmail.com
 Salary: $2000.45
 Office: Tekzima
 Date: Tue Jan 08 00:28:46 EST 2019
 office hour: 8.5 hours 
 Rank: high

 */










