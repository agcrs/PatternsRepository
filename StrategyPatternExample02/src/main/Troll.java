package main;

public class Troll extends Character {

	public Troll(){
		this.weapon = new AxeBehavior();
	}
	
	public void display(){
		System.out.println("I'm the troll!");
	}
}
