package pattern.templateMethod;

public abstract class HouseTemplate {

	public void buildHouse() {
		this.buildHouseLayout();
		this.buildWindow();
		this.buildFloor();
		this.buildWall();
	}

	public void buildHouseLayout() {
		System.out.println("공통 콘크리트, 철근 기본 뼈대 작업 시작");
	}
	
	public abstract void buildWindow();
	public abstract void buildFloor();
	public abstract void buildWall();
	
}
