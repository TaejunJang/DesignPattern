package pattern.templateMethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWindow() {
		System.out.println("나무로 창문 뚝딱");
	}

	@Override
	public void buildFloor() {
		System.out.println("나무로 창문 뚝딱");
	}

	@Override
	public void buildWall() {
		System.out.println("나무로 창문 뚝딱");
	}

}
