import java.math.BigDecimal;

public class Square3 extends Shape3 {
  private double length;

  public Square3(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

 
  @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.length)) //
        .doubleValue();
  }

}