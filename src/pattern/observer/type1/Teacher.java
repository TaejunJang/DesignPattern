package pattern.observer.type1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private List<Observer> observers = new ArrayList();
	
	//알림 받을 학생들 추가요~
	public void addStudent(Observer observver) {
		observers.add(observver);
	}
	
	//알림 받을 학생에게 통지~
	public void notifyObservers(String alim) {
		
		//차례로 돌면서 통지
		for (Observer observer:observers) {
			observer.receive(alim);
		}
		
	}
	
}
