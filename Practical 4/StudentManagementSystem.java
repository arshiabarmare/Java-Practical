import java.util.Scanner;

class Student{
	int StudentId;
	String StudentName;
	String Course;
	double AAS, Java, Python, total, percentage;

	Student(){
		StudentId=0;
		StudentName="Unknown";
		Course="Not Assigned";
		AAS= Java= Python= 0;	
	}

	Student(int ID, String name, String course, double aas, double java, double python){
		StudentId=ID;
		StudentName=name;
		Course=course;
		AAS=aas;
		Java=java;
		Python=python;
	}
	
	public void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your StudentID: ");
		StudentId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Name: ");
		StudentName=sc.nextLine();

		System.out.println("Enter your Course: ");
		Course=sc.nextLine();

		System.out.println("Enter your marks in ASS: ");
		AAS=sc.nextDouble();

		System.out.println("Enter your marks in Java: ");
		Java=sc.nextDouble();

		System.out.println("Enter your marks in Python: ");
		Python=sc.nextDouble();
	}

	void CalculateTotal(){
		total=AAS+Java+Python;
	}
	void CalculatePercentage(){
		percentage=(total/300)*100;
	}

	void displaydetail(){
		System.out.println("StudentId: "+ StudentId);
		System.out.println("StudentName: "+ StudentName);
		System.out.println("Course: "+ Course);
		System.out.println("Marks in AAS: "+ AAS);
		System.out.println("Marks in Java: "+ Java);
		System.out.println("Marks in Python: "+ Python);
		System.out.println("Total Marks: "+ total);
		System.out.println("Percentage: "+ percentage);
	}
}

class StudentManagementSystem{
	public static void main(String cp[]){
		Student s1=new Student();
		System.out.println("Enter Student 1 details: ");
		s1.accept();
		s1.CalculateTotal();
		s1.CalculatePercentage();

		Student s2=new Student(101, "Siya", "BSc. CS", 67, 87, 98);
		s2.CalculateTotal();
		s2.CalculatePercentage();
	
		System.out.println("\n Student 1 Details: ");
		s1.displaydetail();
		System.out.println("\n Student 2 Details: ");
		s2.displaydetail();
	}
}