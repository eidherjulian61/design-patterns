package decorator;

public class ConcreteDecoratorA extends Decorator {
  
  private static final String ADDED_STATE = "ConcreteDecoratorA.operation()";
  
  @Override
  public void operation() {
    super.operation();
    System.out.println(ADDED_STATE);
  }
  
}
