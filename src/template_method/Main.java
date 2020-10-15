package template_method;

public class Main {

	public static void main(String[] args) {
		AbstractClass aA = new ConcreteClassA();
		aA.templateMethod();
		AbstractClass aB = new ConcreteClassB();
		aB.templateMethod();
	}
}