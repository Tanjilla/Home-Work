package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("--------------------------------Sister----------------------");
		Sister st = new Sister();
		st.sister();// void type method
		st.sister(33, 34, 21, "27", 25, 35);// void type parameterized method
		st.sister(23, 29, 55.345f, 45);// return type parameterized method
		Sister.sister(12, 17, 20.3467504);// static void type method
		Sister.sister(24, 31, 36);// static return type parameterized method
		st.sister(56, 37);// final void type parameterized method
		st.sister(47, "18");// final return type parameterized method

		System.out.println("-----------------------------------Niece-----------------------------------");
		Niece ne = new Niece();
		ne.sister();// void type method
		ne.sister(39, 16, 14, "25", 32, 30);// void type parameterized method
		ne.sister(10, 15, 36.345f, 42);// return type parameterized method
	}
}
