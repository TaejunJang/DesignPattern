package pattern.templateMethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWindow() {
		System.out.println("유리로 창문 뚝딱");
	}

	@Override
	public void buildFloor() {
		System.out.println("유리로 바닥 뚝딱");

	}

	@Override
	public void buildWall() {
		System.out.println("유리로 벽 뚝딱");
	}

}
