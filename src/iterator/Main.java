package iterator;

public class Main {

	public static void main(String[] args) {
		String items[] = { "Item A", "Item B", "Item C", "Item D" };
		Aggregate aggregate = new ConcreteAggregate(items);
		for (Iterator iter = aggregate.getIterator(); iter.hasNext();) {
			String item = (String) iter.next();
			System.out.println(item);
		}
	}
}