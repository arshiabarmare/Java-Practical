class Student{
	int RollNo;
	String Name;

	static String Collegename="Mithibai";
	static int count=0;
	
	Student(int rollno, String name){
		RollNo=rollno;
		Name=name;
		count++;
	}
	
	void display(){
		System.out.println("Rollno: "+ RollNo);
		System.out.println("Student Name: "+ Name);
		System.out.println("College Name: "+ Collegename);
	}

	static void totalstudents(){
		System.out.println("Total Student: "+ count);
	}
}

class StudentRecord{
	public static void main(String cp[]){
		Student s1=new Student(01, "RAJ");
		Student s2=new Student(02, "LAXMAN");
		Student s3=new Student(03, "KAIF");

		s1.display();
		s2.display();
		s3.display();

		Student.totalstudents();
	}
}