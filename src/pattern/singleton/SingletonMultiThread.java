package pattern.singleton;

public class SingletonMultiThread implements Runnable {

	@Override
	public void run() {
		
		
		//싱글톤 객체 생성
		Singleton singtonObj = Singleton.getInstance();
		
		//메모리 주소 확인
		System.out.println("싱글톤 객체 메모리주소:"+singtonObj);
	}

}
