package chain_responsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(this.getClass().getSimpleName() + " handled request " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
