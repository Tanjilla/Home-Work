package hw9Abstraction;

/*one keyword is used for inherit the abstract class
 an abstract class can inherit only one abstract class or one regular class by extends keyWord
An abstract class can't inherit an Interface by extends key word
*/
public abstract class MedicalSchool extends NursingSchool  {
	public MedicalSchool() {

	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is non abstract method of biochemistry lab");
	}

}
