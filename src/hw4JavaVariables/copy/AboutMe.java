package hw4JavaVariables.copy;

public class AboutMe {
	// variable declared
	public String name;
	public byte age;
	public short birthdayMonth;
	public int birthdayDay;
	public long birthdayYear;
	public float height;
	public double weight;
	public char sex = 'F';
	public boolean usCitizen;

	// constructor declared
	public AboutMe() {
		System.out.println(" This is about us:");
	}

	// method implemented
	public void aboutMe() {
		System.out.println(" My name " + name + "\n My age: " + age + "\n My birthday Month is " + birthdayMonth
				+ "\n My birthday day is " + birthdayDay + "\n My birthday year is " + birthdayYear + "\n My height is "
				+ height + "\n My weight is " + weight + "\n my sex is " + sex + "\n Im a UScitizen " + usCitizen);
	}
}
