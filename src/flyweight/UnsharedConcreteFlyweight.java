package flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("UnsharedConcreteFlyweight: " + extrinsicstate);
	}
}
