package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.biology2();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		ColumbiaUniversity.biochemistrylab2();
		columbiaUniversity.caring();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.gymnasium();
		columbiaUniversity.dorm();
		columbiaUniversity.morgue();

		System.out.println("\n---------------------------method of University--------------------------------\n");
		University university = new ColumbiaUniversity(); // here ColumbiaUniversity class create because to instantiate
															// interface and abstract class we need help of concrete
															// class
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();

		System.out.println("\n---------------------------method of MedicalSchool--------------------------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();// here ColumbiaUniversity class create because to
																// instantiate interface and abstract class we need help
																// of concrete class
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		MedicalSchool.biochemistrylab2();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anthropology();

	}

}
