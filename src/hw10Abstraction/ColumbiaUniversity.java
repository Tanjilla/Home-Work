package hw10Abstraction;

/*
 two keywords are used for the inheritance in Java for a regular Class
A regular class can't inherit an Interface by extends keyword
 More than one inheritances are possible in a regular Class
*/

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool {
	
	public ColumbiaUniversity() { // default constructor
	
	}
	public void biology() {
		System.out.println("This not abstract method");
		//abstract method cannot be declared inside the Class. because regular class can only contain implemented method. 
		//public abstract void chemistry(); 
	}
	
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	
}
