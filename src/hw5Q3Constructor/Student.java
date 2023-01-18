package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is from the default Constructor of Student class.");
	}

	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("My name is " + stName + ", My student ID is " + stID + ", My sex is " + sex
				+ ", My grade is " + grade + ", I'm a programmer " + isProgrammer);
	}

	public Student(String stName, int stID, char sex) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		System.out.println("My name is " + stName + ", My student ID is " + stID + ", My sex is " + sex);
	}

}
