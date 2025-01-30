import java.math.BigDecimal;

public class Circle {
  private double radius;
  private String color;

  // Constructor
    public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
    }
// getter
    public double getRadius() {
      return this.radius;
    }

    public String getColor() {
      return this.color;
    } 
      // instance method
    public double calculateArea() {
      return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    }
      // static method
      // Design Definition: input -> output 
      // no object so no (this.xx) user give informataion

 // setter
    public void setRadius(double radius) {
      this.radius = radius;
    }
     // static method
      public static double calculateArea2(double radius) {
        return BigDecimal.valueOf(radius)
        .multiply(BigDecimal.valueOf(radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
      }

      public static void main(String[] args) {
        // area
        // BigDecimal

          Circle c1 = new Circle(3.0, " ");
          // Presentation
          System.out.println(c1.calculateArea());

          // Formula
          System.out.println(Circle.calculateArea2(3.0));





      }
    }

