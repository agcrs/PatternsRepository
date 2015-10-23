package main;

public abstract class Character {

	WeaponBehavior weapon;
	
	public Character(){
	}
	
	public abstract void display();
	
	public void useWeapon(){
		weapon.useWeapon();;
	}
	
	public void setWeapon(WeaponBehavior wb){
		weapon = wb;
	}
}
