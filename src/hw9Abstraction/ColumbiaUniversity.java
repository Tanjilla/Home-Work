package hw9Abstraction;

/*A regular class can inherit only one regular class or one abstract class by extends keyword
*A regular class can't inherit an Interface by extends keyword
*a regular class can inherit more than one Interface
*/

public class ColumbiaUniversity extends MedicalSchool {
	public void biology() {
		System.out.println("This not abstract method");
		//abstract method cannot be declared inside the Class. because regular class can only contain implemented method. 
		//public abstract void chemistry(); 
	}
	public ColumbiaUniversity() {
		
		// Default methods are allowed only in interfaces, not in regular class
	}
	
	// this @Override came from medicalSchool because its a abstract class and this also extends another class
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	
}
