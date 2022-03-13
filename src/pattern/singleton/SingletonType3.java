package pattern.singleton;

public class SingletonType3 {

	//정적 멤버 필드에 애초에 객체 생성해버리기
	private static SingletonType3 instance;
	
	//외부에서 객체 생성 불가
	private SingletonType3() {
		
	}
	
	//인스턴스를 만드는 메소드를 임계구역으로 변경
	//멀티 스레드에서 동시 접근시 발행하는 문제를 막고 
	//하나의 스레드가 해당 메소드를 점유하고있을때 락을 걸고 다쓰면 해제하는 방식
	public synchronized static SingletonType3 getInstance() {
		if (instance == null) {
			instance = new SingletonType3();
		}
		return instance;
	}
	
}
