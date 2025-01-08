import java.math.BigDecimal;

// Why do we need Shape (Parent Class)?
public class Circle1 extends Shape { // Parent Class: color
  // Square.class, Triangle.class
  private double radius;
  
  // If you don't specify the constructor, implicitly you have a default empty constructor
  public Circle1(Color color, double radius) {
    // if you don't specify super() here, implicitly you are calling super()
    super(color);
    // super(color); // because you have "extends", you have to "super"
    this.radius = radius;
  }
  
  // Override the parent given method
  // compiler will help to check if the parent class has an area() method
  @Override 
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {
    // new Circle();
    // after you specify a constructor,
    // then the default constructor will be no longer exists
    Circle1 c1 = new Circle1(Color.YELLOW, 3.0);
    
  }
}