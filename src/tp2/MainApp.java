package tp2;

public class MainApp {

	public static void main(String[] args) {
	
		        // إنشاء الكائن الأول
		        Student student1 = new Student();
		        student1.name = "Ahmed";
		        student1.id = 2026001;
		        student1.major = "Computer Engineering";
		        student1.email = "ahmed@univ.dz";

		        // إنشاء الكائن الثاني
		        Student student2 = new Student();
		        student2.name = "Sara";
		        student2.id = 2026002;
		        student2.major = "Cybersecurity";
		        student2.email = "sara@univ.dz";

		        // استدعاء دالة الطباعة
		        student1.displayInfo();
		        student1.major = "Artificial Intelligence";
		        student1.displayInfo();
		        student2.displayInfo();
		        student2.study();
		     // TASK2
		        Student student3 = new Student();
		        student3.name = "Malak";
		        student3.id = 39299616;
		        student3.major = "Ing info";
		        student3.email = "mk0096119@gmail.com";

		        student3.displayInfo();
	}
}