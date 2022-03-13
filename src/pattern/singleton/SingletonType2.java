package pattern.singleton;

public class SingletonType2 {

	//정적 멤버 필드에 애초에 객체 생성해버리기
	private static SingletonType2 instance = new SingletonType2();
	
	//외부에서 객체 생성 불가
	private SingletonType2() {
		
	}
	
	//정적 멤버 필드 
	public static SingletonType2 getInstance() {
		return instance;
	}
	
}
