import StudentInfo.Student;
public class StudentTest{
	public static void main(String cp[]){
		Student s=new Student();
		s.accept();
		s.display();
		
		System.out.println("Grade: "+ s.calGrade());
	}
}