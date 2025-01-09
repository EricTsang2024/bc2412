// Generics Design -> Reduce number of class

import java.util.Objects;

public class GeneralPrinter<T> { // <T> present the scope of "T" inside the class
  private T value;

  public GeneralPrinter(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public String print() {
    return "this is " + this.value.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if(this==obj)
    return true;
    if(!(obj instanceof GeneralPrinter))
    return false;
    GeneralPrinter p = (GeneralPrinter) obj;
    return Objects.equals(this.value, p.getValue());
  }

  // @Override
  // public int hashCode() {
  // return Objects.hash(this.value);
  // }




  public static void main(String[] args) {
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));
    GeneralPrinter<Object> printer2 = new GeneralPrinter<>(new Book1("IJK"));
    GeneralPrinter<Book1> printer3 = new GeneralPrinter<>(new Book1("IJK"));

    Object obj = new Book1("abc");
    if (obj instanceof Integer) { // safety concern
      Integer integer = (Integer) obj;
      System.out.println(integer.compareTo(2)); // true
    } else
      System.out.println("null");

      if(printer2.equals(printer3))
      System.out.println("they are same");
      // System.out.println(printer3.equals(printer2));
      System.out.println(printer2.hashCode());
      System.out.println(printer3.hashCode());
      
      
  }
}