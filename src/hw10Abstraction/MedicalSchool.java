package hw10Abstraction;

/*
 two ( extends and implements) keywords are used for inherit the abstract class
 an abstract class can inherit only one abstract class or one regular class by extends keyWord
 more than one inherit is possible in an abstract class by extends and implements ketword
*/
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() { // This is default constructor

	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is non abstract method of biochemistry lab");
	}

}
