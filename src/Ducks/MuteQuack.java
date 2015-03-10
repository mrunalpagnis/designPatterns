/**
 * 
 */
package Ducks;

/**
 * @author mrunal
 *
 */
public class MuteQuack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see Ducks.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// few Artificial ducks do not have sound 
		System.out.println("Do not Quack");
	}

}
