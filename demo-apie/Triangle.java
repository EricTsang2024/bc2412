import java.math.BigDecimal;

public class Triangle extends Shape{

  private double length;
  private double width;

  public Triangle(String name, double length, double width) {
    super(name);
    this.length = length;
    this.width = width;    
  }

  public double getLength() {
    return this.length;
  } 

  public double getWidth() {
    return this.width;
  }

  public double calculateArea() {
    double Area = 0.0;
    return Area = BigDecimal.valueOf(this.width)
    .multiply(BigDecimal.valueOf(this.length))
    .divide(BigDecimal.valueOf(2.0))
    .doubleValue();

  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle("Yellow", 2.0, 2.0);
    System.out.println(t1.calculateArea());

  }
  
  }

