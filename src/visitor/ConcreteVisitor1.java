package visitor;

public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(
				concreteElementA.getClass().getSimpleName() + " visited by " + this.getClass().getSimpleName());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(
				concreteElementB.getClass().getSimpleName() + " visited by " + this.getClass().getSimpleName());
	}

}
