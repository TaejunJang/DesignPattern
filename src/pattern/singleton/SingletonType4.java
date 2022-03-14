package pattern.singleton;

public class SingletonType4 {

	
	private static SingletonType4 instance;
	
	//외부에서 객체 생성 불가
	private SingletonType4() {
		
	}
	
	//클래스 내부에 정적 클래스를 추가
	private static class InnerInstanceClazz	{
		private static final SingletonType4 singletonInstance = new SingletonType4();
	}
	
	public static SingletonType4 getInstance() {
		//클래스가 로드될때 초기화된 정적 멤버 객체 리턴
		return InnerInstanceClazz.singletonInstance;
	}
	
}
