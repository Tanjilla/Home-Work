package hw4JavaVariables.copy;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe tanjilla = new AboutMe();// constructors initialized
		// variable initialized
		tanjilla.name = " Tanjilla islam";
		tanjilla.age = 21;
		tanjilla.birthdayMonth = 007;
		tanjilla.birthdayDay = 277;
		tanjilla.birthdayYear = 200145628l;
		tanjilla.height = 5.001f;
		tanjilla.weight = 150.00;
		tanjilla.sex = 'F';
		tanjilla.usCitizen = true;
		tanjilla.aboutMe();// method is initialized

		System.out.println("\n----------------------------------------------------------------\n");

		AboutMe alex = new AboutMe();
		alex.name = "Alex";
		alex.age = 30;
		alex.birthdayMonth = 006;
		alex.birthdayDay = 0620;
		alex.birthdayYear = 1998624547l;
		alex.height = 5.07f;
		alex.weight = 190.00;
		alex.sex = 'M';
		alex.usCitizen = true;
		alex.aboutMe();

	}

}
