package builder;

public class ConcreteBuilder1 implements Builder {

	private Product product = new Product();

	@Override
	public Product getResult() {
		return product;
	}

	@Override
	public void buildPartA() {
		product.add("PartA");
	}

	@Override
	public void buildPartB() {
		product.add("PartB");
	}
}
