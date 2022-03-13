package pattern.singleton;

public class Main {

	public static void main(String[] args) {
		
		//static 메소드니까 객체 생성없이 바로 호출
		Singleton singletoneObj = Singleton.getInstance();
		Singleton singletoneObj2 = Singleton.getInstance();
		
		//객체 메모리 주소 확인
		System.out.println(singletoneObj);
		System.out.println(singletoneObj2);
		
	}

}
