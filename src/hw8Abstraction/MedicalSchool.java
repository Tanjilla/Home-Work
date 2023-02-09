package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is non abstract method of biochemistry lab");
	}

	public MedicalSchool() {

	}

}
