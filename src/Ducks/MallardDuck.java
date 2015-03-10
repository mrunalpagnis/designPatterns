/**
 * 
 */
package Ducks;

/**
 * @author mrunal
 * Mallard is real duck type performing swim, fly and quack
 */
public class MallardDuck extends Duck {

	public MallardDuck()
	{
		fb = new FlyWithWings();
		qb = new Quack();
	}
	@Override
	public void display() {
		// Display duck type
		System.out.println("I am Mallard Duck");
	}
	
}
