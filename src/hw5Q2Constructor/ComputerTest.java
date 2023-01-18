package hw5Q2Constructor;

public class ComputerTest {
	
	public static void main(String[] args) {
		 Computer computer1 = new Computer();
		 Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojav", 800l, 'A' , false);
		 Computer computer3 = new Computer( 800l, 'A' , false);
		 Computer computer4 = new Computer( "Apple", "MacBook Air", "MacOS Mojav");
			
	}

}
