package pattern.observer.type2;

public interface Observer {

	//기상 정보가 변경되었을때 옵저버 한테 전달되는 상태 값들
	public void update(float temperature, float humidity, float pressure);
	
}
