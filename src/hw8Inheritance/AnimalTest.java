package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal(); // here is Animal class single inheritance parent class
		animal.animalInfo();
// here animal is hierarchical because more then one derived class created from this
		// example: mammal extends animal, reptile extends animal, also bird extends
		// animal.
		System.out.println("\n------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n------------------------------\n");
		Reptile reptile = new Reptile();// hierarchical
		reptile.reptileInfo();
		reptile.animalInfo();
		// yes, the object can call other method if the class is extend.

		System.out.println("\n------------------------------\n");
		Birds birds = new Birds();// here bird is a child class and animal is parent class, here bird extend from
									// animal, so this is a single inheritance
		birds.birdsInfo();
		birds.animalInfo();
		// yes, the object can call other method if the class is extend.

		System.out.println("\n------------------------------\n");
		Dog dog = new Dog();// Multilevel inheritance
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();
		// yes, the object can call other method if the class is extend.

		System.out.println("\n------------------------------\n");
		Snake snake = new Snake();// Multilevel inheritance
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n------------------------------\n");
		Robin robin = new Robin();// Multilevel inheritance
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		// this is the example of multilevel inheritance because a derived class created
		// from another derived class, bulldog extends dog, dog extends mammal, and
		// mammal extends animal
		System.out.println("\n------------------------------\n");
		BullDog bullDog = new BullDog();// Multilevel inheritance
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n------------------------------\n");
		Cobra cobra = new Cobra();// Multilevel inheritance
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
