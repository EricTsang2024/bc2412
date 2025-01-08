import java.math.BigDecimal;

public class Circle3 extends Shape3 {

  private double radius;

  public Circle3(double radius) {
    this.radius = radius;
  }

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
}