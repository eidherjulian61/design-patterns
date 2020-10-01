package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
		if (s1 == s2) {
			System.out.println("Objects are the same instance");
		}
	}
}
