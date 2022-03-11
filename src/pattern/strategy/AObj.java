package pattern.strategy;

public class AObj {

	AInterface ainterface;
	
	public AObj(AInterface a) {
		this.ainterface = a;
	}
	
	public void funcAA() {
		//System.out.println("AAA");
		//System.out.println("AA");
		//~ 기능이 필요합니다. 개발해주세요
		
		ainterface.funcA();
		ainterface.funcA();
	}
	
}
