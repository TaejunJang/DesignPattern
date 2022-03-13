package pattern.singleton;

public class Main {

	public static void main(String[] args) {
		
		//static 메소드니까 객체 생성없이 바로 호출
		Singleton singletoneObj = Singleton.getInstance();
		Singleton singletoneObj2 = Singleton.getInstance();
		
		//객체 메모리 주소 확인
		System.out.println(singletoneObj);
		System.out.println(singletoneObj2);
		
		//singletoneObj 객체에서 클래스 필드 수정 
		singletoneObj.singleToneCnt = 2;
		
		//singletoneObj2 에서 singleToneCnt 클래스 필드 확인
		System.out.println("singleToneCnt 확인:"+singletoneObj2.singleToneCnt);
		
	}

}
