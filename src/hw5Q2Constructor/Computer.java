package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public long price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}

	public Computer(String brand, String model, String operatingSystem, long price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println(
				"The Brand is " + brand + ", The Model is " + model + ", The Operating System is " + operatingSystem
						+ ", The Price is " + price + ", The Grade is " + grade + ", It's Made is USA " + madeInUSA);
	}

	public Computer(long price, char grade, boolean madeInUSA) {
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("The Price is " + price + ", The Grade is " + grade + ", It's Made is USA " + madeInUSA);
	}

	public Computer(String brand, String model, String operatingSystem) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;

		System.out.println(
				"The Brand is " + brand + ", The Model is " + model + ", The Operating System is " + operatingSystem);

	}
}
