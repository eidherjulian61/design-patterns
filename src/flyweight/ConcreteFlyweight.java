package flyweight;

public class ConcreteFlyweight implements Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("ConcreteFlyweight: " + extrinsicstate);
	}
}
