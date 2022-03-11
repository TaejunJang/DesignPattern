package pattern.strategy;

public class GameCharacter {

	//접근점 제공
	private Weapon weapon;
	
	public void setWeapon(Weapon argWeapon) {
		this.weapon = argWeapon;
	}
	
	public void attack() {
		weapon.attack();
	}
}
