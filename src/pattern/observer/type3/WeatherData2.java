package pattern.observer.type3;

import java.util.ArrayList;
import java.util.Observable;

import pattern.observer.type2.Observer;
import pattern.observer.type2.Subject;

public class WeatherData2 extends Observable{

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData2() {
	}
	

	
	public void measurementsChanged() {
		super.setChanged();
		
		super.notifyObservers();
		
		//super.notifyObservers(observers);
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}



}
