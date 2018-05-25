package observer;

public class ConcreteObserver implements Observer {

	private String name;
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		String observerState = subject.getSubjectState();
		System.out.println("Observer " + name + " state is " + observerState);
	}

}
