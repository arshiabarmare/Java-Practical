public class EmployeeInterface{
	public static void main(String cp[]){
		Manager m=new Manager();
		m.accept();
		m.calculateSalary();
		m.displaydetails();

		Developer d=new Developer();
		d.accept();
		d.calculateSalary();
		d.displaydetails();

	}
}