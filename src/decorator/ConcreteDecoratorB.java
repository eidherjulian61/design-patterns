package decorator;

public class ConcreteDecoratorB extends Decorator {
  
  @Override
  public void operation() {
    super.operation();
    addedBehavior();
    System.out.println("ConcreteDecoratorB.operation()");
  }

  private void addedBehavior() {
    System.out.println("ConcreteDecoratorB.addedBehavior()");
  }
}
