package hw3JavaVariables;

public class AboutMe {

	public String country;
	// here the variable declare

	public String name = "Tanjilla Islam";
	// here the variable initialize
	public byte age = 21;
	public short birthdayMonth = 07;
	public int birthdayDay = 27;
	public long birthdayYear = 2001l;
	public float height = 5.1f;
	public double weight = 140.00;
	public char sex = 'F';
	public boolean usCitizen = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.birthdayMonth);
		System.out.println(" My name is " + aboutMe.name + "\n My age is " + aboutMe.age + "\n My birthday month is "
				+ aboutMe.birthdayMonth);
	}
}
