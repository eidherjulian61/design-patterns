package memento;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("State = " + state);
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memento) {
		System.out.println("Restoring state...");
		setState(memento.getState());
	}
}
