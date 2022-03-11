package pattern.strategy;

public class GameCharacter {

	//������ ����
	private Weapon weapon;
	
	public void setWeapon(Weapon argWeapon) {
		this.weapon = argWeapon;
	}
	
	public void attack() {
		weapon.attack();
	}
}
