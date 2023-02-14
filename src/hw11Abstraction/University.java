package hw11Abstraction;

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