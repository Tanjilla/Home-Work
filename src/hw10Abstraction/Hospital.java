package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public abstract void surgeryRoom();
	public void cafeteria();
	//default method
		default void morgue() {	
		}
		// static method
		public static void pharmacy() {
		}
}
