package pattern.observer.type1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 student1 = new Student1("철수");
		Student2 student2 = new Student2("영희");
		Student3 student3 = new Student3("민희");
		
		Teacher teacher = new Teacher();
		teacher.addStudent(student1);
		teacher.addStudent(student2);
		teacher.addStudent(student3);
		teacher.notifyObservers("내일 놀토에요 학교오지 마세요!");
		
	}

}
