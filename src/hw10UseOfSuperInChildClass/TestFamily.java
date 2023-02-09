package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		Daughter daughter = new Daughter(); 
		
		System.out.println("\n----------------------------------------------------------------------------------------\n");

		Daughter daughter2 = new Daughter(" July,", 21);
		
		System.out.println("\n----------------------------------------------------------------------------------------\n");
		
		daughter.daughter();
		
		System.out.println("\n------------------------------------------------------------------------------------------\n");
		
		daughter.daughter(" July,", 21);
		
		
	}
	

}
