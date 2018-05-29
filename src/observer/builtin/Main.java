package observer.builtin;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.addObserver(new ConcreteObserver(s, "X"));
		s.addObserver(new ConcreteObserver(s, "Y"));
		s.addObserver(new ConcreteObserver(s, "Z"));
		s.setSubjectState("ABC");
		s.notifyObservers();
	}

}
