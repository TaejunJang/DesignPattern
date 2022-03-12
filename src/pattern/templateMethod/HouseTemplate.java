package pattern.templateMethod;

public abstract class HouseTemplate {

	//자식 클래스에서 오버라이드 방지위를 위해 final 추가
	public final void buildHouse() {
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
