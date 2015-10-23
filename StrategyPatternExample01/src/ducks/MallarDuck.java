package ducks;

import behaviors.FlyWithWings;
import behaviors.Quack;

public class MallarDuck extends Duck {

	public MallarDuck(){
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
