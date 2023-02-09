package hw10UseOfSuperInChildClass;

public class Daughter extends Father{
	public String birthMonth;
	public int age;
	
	public Daughter() { // This is a default constructor
		super(); // i can use super method inside the constructor and it has to be in the first and can used 2 super method 
		super.father(); // in constructor i can use both super method and super keyword 
		super.familyName = " Nur "; // also i can initialize the variable name inside constructor by super keyword but not by super method
		
		System.out.println(" This is a default constructor from the child/sub class of Daughter class");
	}

	// This is a parameterized constructor
	public Daughter(String birthMonth, int age) {
		super(" Nurul Islam", 62, 'M', false );
		super.father();
		super.familyName = " Nur ";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println(" Daughter birthmont is:" + birthMonth + " Her age is:" + age);
	}
	
	// This is a implemented method
	public void daughter() {
		// super(); i can't create super method inside method
		super.father();// but i create call super keyword inside a method
		super.familyName = " Nur"; // i can initialize the variable name inside method by super keyword not by super method
		System.out.println(" This is a void type implemented method from the child/sub class of Daughter class");
	}
	
	// This is a parameterized method
	public void daughter(String birthMonth, int age) {
		super.father(" Nurul islam,", 62, 'M', false); // i can initialize the parameterize method by super keyword but not  super method 
		super.father();
		super.familyName = " Nur "; // i can initialize the variable name inside method by super keyword not by super method
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println(" Daughter birthmont is:" + birthMonth + " Her age is:" + age);
	}
}
