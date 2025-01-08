// Generics

import java.math.BigDecimal;

// The T in "Class, instance variable, instance method" are with same definition
// But the T in static method is completely different thing. so, we need redefine.
public class Box<T extends Shape3> {
  private T[] shapes;

  public Box() {
    this.shapes = (T[]) new Shape3[2];
  }

  // The T in instance method refers to the definition T of Class
  public void addShape(int index, T shape) {
    this.shapes[index] = shape;
  }

  public double totalArea() { // shapes[0].area()
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape3 shape : this.shapes) {
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  // The T in static method is not referring the T in Class
  public static <T extends Shape> double totalArea2(T[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Box<Circle3> b1 = new Box<>();
    b1.addShape(0, new Circle3(3.0));
    b1.addShape(1, new Circle3(4.0));
    System.out.println(b1.totalArea()); // 78.53981633974483

    // add Circle to shape[0]
    // add Square to shape[1]
    Box<Shape3> b2 = new Box<>();
    b2.addShape(0, new Circle3(3.0));
    b2.addShape(1, new Square3(3.0));
    System.out.println(b2.totalArea()); // 37.274333882308134

    // Team<Hero>
  }
}