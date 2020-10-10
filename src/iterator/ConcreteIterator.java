package iterator;

public class ConcreteIterator implements Iterator {

	private String items[];
	private int index;

	public ConcreteIterator(String[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (index < items.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return items[index++];
		}
		return null;
	}
}
