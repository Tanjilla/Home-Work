package hw11Abstraction;

public interface College {
	public void commonRoom();
	public abstract void laboratory();
	public void languageClub();
	
	default void dorm() {
		//default method
	}
	public static void studyRoom() {
		// static method
	}
}


