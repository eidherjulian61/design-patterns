package state;

public class Context {

	private State state;

	public Context(State state) {
		setState(state);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("State: " + state.getClass().getSimpleName());
	}

	public void request() {
		state.handle(this);
	}
}