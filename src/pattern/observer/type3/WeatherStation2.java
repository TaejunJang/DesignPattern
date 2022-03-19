package pattern.observer.type3;

public class WeatherStation2 {
	public static void main(String[] args) {
		WeatherData2 weatherData = new WeatherData2();
		
		CurrentConditionsDisplay2 currentDisplay = new CurrentConditionsDisplay2(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 75, 29.4f);
		weatherData.setMeasurements(81, 90, 29.4f);
		
		/*
		 * 현재 날씨:온도-80.0,습도-65.0 현재 날씨:온도-82.0,습도-75.0 현재 날씨:온도-81.0,습도-90.0
		 */

	}
}
