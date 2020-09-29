package prototype;

public class Main {

	public static void main(String[] args) {
		ConcretePrototype1 p1 = new ConcretePrototype1("I");
		ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
		System.out.println("Cloned: " + c1.getId());

		ConcretePrototype2 p2 = new ConcretePrototype2("II");
		ConcretePrototype2 c2 = (ConcretePrototype2) p2.clone();
		System.out.println("Cloned: " + c2.getId());
	}

}
