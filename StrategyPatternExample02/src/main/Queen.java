package main;

public class Queen extends Character {

	public Queen(){
		this.weapon = new BowAndArrowBehavior();
	}
	
	public void display(){
		System.out.println("I'm the queen!");
	}
}
