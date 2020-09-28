package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private List<String> parts = new ArrayList<>();
	
	public void show() {
		System.out.println("\nProduct Parts -------");
		for (String part : parts) {
			System.out.println(part);
		}
	}

	public void add(String part) {
		parts.add(part);
	}

}
