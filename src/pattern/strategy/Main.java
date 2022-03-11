package pattern.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AInterface aInterface = new AInterfaceImpl();
		//aInterface.funcA();
		
		AObj aObj = new AObj(new AInterfaceImpl());
		aObj.funcAA();
		
		GameCharacter character = new GameCharacter();
		character.setWeapon(new ShotGun());
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		
	}

}
