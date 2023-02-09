package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() { // This is a default constructor
		System.out.println(" This is a default constructor from super ( parent/base) class of father class");
	}

	// This is a parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(" Father name is :" + name + " His age is:" + age + " His sex is:" + sex + " He is citizen" + usCitizen);
	}
	
	// This is a implemented method 
	public void father() {
		System.out.println(" This is a void type implemented method from super ( parent/base) class of father class");
	}

	// This is a parameterized method
	public void father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(" Father name is :" + name + " His age is: " + age + " His sex is: " + sex + " He is citizen: " + usCitizen);
	}
}
