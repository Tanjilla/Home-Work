package hw12Polymorphism;

/* method Overloading.
* we can create several type method with the same name as long it ,
*different type parameterized method or sequence/ value types are different.
*/
public class Sister {
	// void type method
	public void sister() {
		System.out.println("This is a void type method from sister class");
	}

	// void type parameterized method
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of sister" + total1);
	}

	// return type parameterized method
	public int sister(int age2, int age3, float age4, int age5) {
		int total2 = age2 + age3 + (int) age4 + age5;
		System.out.println("Total age of sister" + total2);
		return total2;
	}

	// static void type method
	public static void sister(int age1, int age6, double age3) {
		int total3 = age1 + age6 + (int) age3;
		System.out.println("Total age of sister" + total3);

	}

	// static return type parameterized method
	public static int sister(int age2, int age5, int age6) {
		int total4 = age2 + age5 + age6;
		System.out.println("Total age of sister" + total4);
		return total4;
	}

	// final void type parameterized method
	public final void sister(int age3, int age5) {
		int total5 = age3 + age5;
		System.out.println("Total age of sister" + total5);
	}

	// final return type parameterized method
	public final int sister(int age6, String age4) {
		int total6 = age6 + Integer.parseInt(age4);
		return total6;

	}
}