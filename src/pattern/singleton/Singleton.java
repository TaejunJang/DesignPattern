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
	
	//멀티스레드에서 사용될때 문제가 발생하게 만드는 케이스 객체 생성 메소드 추가
	public static Singleton getInstanceInMultiThread() {
		
		if (instance == null) {
			
			try {
				//해당 스레드 강제로 1초 지연
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//객체생성
			instance = new Singleton();
		}
		
		return instance;
		
	}
	
}
