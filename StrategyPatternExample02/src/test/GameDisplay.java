package test;

import main.Character;
import main.King;
import main.SwordBehavior;

public class GameDisplay {
	public static void main(String[] args){
		Character king = new King();
		king.display();
		king.useWeapon();
		king.setWeapon(new SwordBehavior());
		king.useWeapon();
		
	}
}
