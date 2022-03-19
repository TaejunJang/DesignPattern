package pattern.observer.type3;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay2 implements  Observer,DisplayElement2{

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay2(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherData2) {
			WeatherData2 weatherData = (WeatherData2) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
		
	}
	
	@Override
	public void display() {
		System.out.println("현재 날씨:"+"온도-"+temperature+",습도-"+humidity);
	}



}
