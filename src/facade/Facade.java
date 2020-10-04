package facade;

public class Facade {

	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;

	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}

	public void methodA() {
		System.out.println("\nmethodA() ---- ");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}

	public void methodB() {
		System.out.println("\nmethodB() ---- ");
		two.methodTwo();
		three.methodThree();
	}
}
