package pattern.strategy;

public class AObj {

	AInterface ainterface;
	
	public AObj(AInterface a) {
		this.ainterface = a;
	}
	
	public void funcAA() {
		//System.out.println("AAA");
		//System.out.println("AA");
		//~ ����� �ʿ��մϴ�. �������ּ���
		
		ainterface.funcA();
		ainterface.funcA();
	}
	
}
