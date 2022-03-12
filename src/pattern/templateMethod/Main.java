package pattern.templateMethod;

public class Main {

	public static void main(String[] args) {
		HouseTemplate houseTemplate = new GlassHouse();
		houseTemplate.buildHouse();
		
		houseTemplate = new WoodenHouse();
		houseTemplate.buildHouse();
	}

}
