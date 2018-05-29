package observer.builtin;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		setChanged();
	}
    
}
