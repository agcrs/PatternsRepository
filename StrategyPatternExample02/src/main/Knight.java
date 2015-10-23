package main;

public class Knight extends Character {

	public Knight(){
		this.weapon = new SwordBehavior();
	}
	
	public void display(){
		System.out.println("I'm the knight!");
	}
}
