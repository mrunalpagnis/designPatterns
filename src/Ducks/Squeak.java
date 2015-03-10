/**
 * 
 */
package Ducks;

/**
 * @author mrunal
 *
 */
public class Squeak implements QuackBehavior {

	/* (non-Javadoc)
	 * @see Ducks.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// Rubber duck will squeak
		System.out.println("Squeak");
	}

}
