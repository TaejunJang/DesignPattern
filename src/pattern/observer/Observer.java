package pattern.observer;

public class Observer {

	public String studentName;
	
	
	public void receive(String notice) {
		System.out.println(studentName+"학생 통신문내용:"+notice);
	}
	
}
