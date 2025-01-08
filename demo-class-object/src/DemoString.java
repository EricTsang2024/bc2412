public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = s;
    String s4 = "hello!";
    String s5 = new String("hello!");
   
    String s6 = String.valueOf("hello");
    String s7 = new String("hello!");

    // identityHashCode - > Object reference (address)
    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s4));
    System.out.println(System.identityHashCode(s5));
    System.out.println(System.identityHashCode(s6));
    System.out.println(System.identityHashCode(s7));

    // equals(), ==
    // If you use "=="for non-primitive, you are checking the object reference
    // Besides, s.equals() is checking the String value itself
    System.out.println(s == s2);
    System.out.println(s.equals(s2));

    System.out.println(s == s5); // false
    System.out.println((s.equals(s5)));

    // String is immutable (Purpose: Reduce Risk)
    
    // Question: after appending "?", is "s" still the same object?
    s = s + "?";
    System.out.println(System.identityHashCode(s));
  }
}
