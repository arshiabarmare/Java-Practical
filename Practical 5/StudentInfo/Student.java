package StudentInfo;
import java.util.Scanner;
public class Student{
	int Studentid;
	String StuName;
	String course;
	double marks;

	public void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		Studentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		StuName=sc.nextLine();
		System.out.println("Enter Course: ");
		course=sc.nextLine();
		System.out.println("Enter Marks: ");
		marks=sc.nextDouble();	
	}

	public void display(){
		System.out.println("Id: "+ Studentid);
		System.out.println("Name: "+ StuName);
		System.out.println("Course: "+ course);
		System.out.println("Marks: "+ marks);
	}

	public String calGrade(){
		if(marks>=90 && marks<=100){
			return "A+";
		}
		else if(marks>=80 && marks<=89){
			return "A";
		}
		else if(marks>=70 && marks<=79){
			return "B";
		}
		else if(marks>=60 && marks<=69){
			return "C";
		}
		else{
			return "D";
		}
	}
}