package chain_responsibility;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println(this.getClass().getSimpleName() + " handled request " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
