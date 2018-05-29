package observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	Observable subject;
	private String name;
	
	public ConcreteObserver(Observable subject, String name) {
		this.subject = subject;
		this.name = name;
		this.subject.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof ConcreteSubject) {
			ConcreteSubject observable = (ConcreteSubject)obs;
			System.out.println("Observer " + name + " state is " + observable.getSubjectState());
		}		
	}

}
