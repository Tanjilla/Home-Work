package hw10Abstraction;

/*
 only one (extends) keyword is used to inheritance in interface
An Interface can inherit other interface, but interface can't inherit a regular class or an abstract class by extends keyword
An Interface can inherit more than one Interface  by extends keyword
 */

public interface University extends College, Hospital {
	public void classSize();// declared method
	public void playGround();
	public void teacher();

	// public University() {} ---> constructor
	// we can't create a constructor inside an interface class

	default void gymnasium() { // default method
		System.out.println("This default method gymnasium from University Interface");
	}

	public static void library() { // static method
		System.out.println("This static method library from University Interface");
	}
	
}