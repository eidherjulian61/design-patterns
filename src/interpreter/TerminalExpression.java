package interpreter;

public class TerminalExpression implements AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("Called Terminal.interpret()");
	}

}
