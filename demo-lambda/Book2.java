public record Book2(String name, double price) {
  // private String author;
  public static final double PI = 3.14;

  // public Book() {

  // }

  public void print() {
    System.out.println(name + price);
  }

  public static void main(String[] args) {
    Book2 b1 = new Book2("ABC", 10.5);
    System.out.println(b1.name()); // ABC
    System.out.println(b1.price()); // 10.5
    System.out.println(new Book2("ABC", 10.5).equals(b1)); // true
    System.out.println(new Book2("ABC", 10.5).hashCode()); // 1078168574
    System.out.println(b1.hashCode()); // 1078168574
    System.out.println(b1); // Book[name=ABC, price=10.5]
    b1.print();
    System.out.println(Book2.PI); // 3.14

    // All-arg constructor ONLY
    // renamed getter 
    // no setter (immutable)
    // Support equals() and hashCode()
    // Support toString()
    // Support static variable/ method
    // Support custom instance method
    // Do not support custom attirbute
    // Do not support custom contructor

  }
}