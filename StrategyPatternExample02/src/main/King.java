package main;

public class King extends Character {

	public King(){
		this.weapon = new KnifeBehavior();
	}
	
	public void display(){
		System.out.println("I'm the king!");
	}
}
