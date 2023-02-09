package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName(" Tanjilla Islam.");
		employee.setAge(21);
		employee.setSex('F');
		employee.setcitizen(true);
		System.out.println(" Employee name is" + employee.getName() + " \n Employee Age is " + employee.getAge()
				+ "\n Employee Sex is " + employee.getSex() + "\n Employee is a USA Citizen " + employee.isCitizen());
	}

}
