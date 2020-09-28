package builder;

public class ConcreteBuilder2 implements Builder {

	private Product product = new Product();

	@Override
	public Product getResult() {
		return product;
	}

	@Override
	public void buildPartA() {
		product.add("PartX");
	}

	@Override
	public void buildPartB() {
		product.add("PartY");
	}
}
