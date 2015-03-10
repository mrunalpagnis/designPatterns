/**
 * 
 */
package Ducks;

/**
 * @author mrunal
 * Base class for all types of ducks
 */
public abstract class Duck {
	FlyingBehavior fb;
	QuackBehavior qb;
	public void performFly() {
		fb.fly();
	}
	public void performQquack() {
		qb.quack();
	}
	public void swim()
	{
		System.out.println("All ducks can swim, even decoy");
	}
	public abstract void display();
	public void setFlyingBehavior(FlyingBehavior f)
	{
		fb = f;
	}
}
