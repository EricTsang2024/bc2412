public class Calculator1<T extends Number> { // Byte, Short, Integer, Long, Float, Double
  // if we achieve the same purpose without generics,
  // ByteCalculator.class
  // ShortCalculator.class
  // IntegerCalculator.class
  // LongCalculator.class
  // FloatCalculator.class
  // LongCalculator.class
  // NumberCalculator.class

  private T x;
  private T y;

  public Calculator1(T x, T y) {
    this.x = x;
    this.y = y;
  }

  // Allow overflow
  // public Number sum() { // (short) Short -> long -> Long
  //   if (this.x instanceof Byte && this.y instanceof Byte) {
  //     return (byte) this.x + (byte) this.y; // byte + byte -> int -> Integer
  //   } else if (this.x instanceof Short && this.y instanceof Short) {

  //   } else if (this.x instanceof Integer && this.y instanceof Integer) {

  //   } else if (this.x instanceof Long && this.y instanceof Long) {

  //   } else if (this.x instanceof Float && this.y instanceof Float) {

  //   } else if (this.x instanceof Double && this.y instanceof Double) {

  //   }
  // }

  public static void main(String[] args) {
    Calculator1<Byte> calculator =
        new Calculator1<>(Byte.valueOf("10"), Byte.valueOf("20"));

    Calculator1<Number> calculator2 =
        new Calculator1<>(Byte.valueOf("10"), Short.valueOf("20"));
    // private Number x;
    // private Number y;
  }

}