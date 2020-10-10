package iterator;

public class ConcreteAggregate implements Aggregate {
	private String items[];

	public ConcreteAggregate(String[] items) {
		this.items = items;
	}

	@Override
	public Iterator getIterator() {
		return new ConcreteIterator(items);
	}
}
