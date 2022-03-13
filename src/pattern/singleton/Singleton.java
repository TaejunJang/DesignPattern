package pattern.singleton;

public class Singleton {

	//외부에서 변경 못하게 private 선언
	private static Singleton instance;
	
	public static int singleToneCnt = 1;
	
	//외부에서 생성자 사용 못하게 private 접근제어 사용
	private Singleton() {
		
	}
	
	//외부에서도 접근 가능하도록 public
	public static Singleton getInstance() {
		
		//객체는 딱 한번만 생성하도록
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
 	}
	
}
