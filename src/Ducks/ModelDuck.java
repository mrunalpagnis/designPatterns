package Ducks;

public class ModelDuck extends Duck {

	public ModelDuck()
	{
		fb = new FlyNoWay();
		qb = new Squeak();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model duck");
	}

}
