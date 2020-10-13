package memento;

public class Main {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		o.setState("Off");
		o.setMemento(c.getMemento());
	}
}