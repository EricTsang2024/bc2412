// Class cannot extend more than Parent Class

import java.util.Objects;

public class Pig extends Animal {
  // more attributes
  private int age;

  public Pig(int age) {
    // implicitly calling super()
    // super(); // Animal()
    // super("XYZ"); // Animal("XYZ")
  }

  public Pig(String name) {
    super(name);
  }

  public Pig(String name, int age) {
    super(name);
    this.age = age;
  }

  // implicitly extend Object.class (Object.equals() -> check if they are same memory object)
  @Override
  public boolean equals(Object obj) {
    // same object -> they must be same
    if (this == obj)
      return true;
    if (!(obj instanceof Pig))
      return false;
    Pig pig = (Pig) obj; // from Parent class to child class (int x = (int) 10L)
    return Objects.equals(pig.getAge(), this.age)
        && Objects.equals(pig.getName(), super.getName());
    // return pig.getAge() == this.age //
    // && pig.getName().equals(super.getName());
  }

  // implicitly extend Object.class (Object.hashCode() -> check if they are same memory object)
  @Override
  public int hashCode() {
    return Objects.hash(this.age, super.getName()); 
    // hash -> generate a new int number representing the object
  }

  @Override
  public String toString() {
    return "Pig[" //
        + "age=" + this.age //
        + ", name=" + super.getName() //
        + "]";
  }

  public int getAge() {
    return this.age;
  }

  public void sleep() {
    System.out.println("Pig is sleeping ...");
  }

  public static void main(String[] args) {
    Pig pig = new Pig(3);
    Pig pig2 = new Pig("IJK");

    pig.sleep();
    System.out.println(pig.getName()); // null
    System.out.println(pig2.getName()); // IJK

    Object object = new Object();
    Pig myPig = new Pig("ABC", 3);
    Pig checkPig = new Pig("ABC", 3);
    // equals()
    if (myPig.getAge() == checkPig.getAge()
        && myPig.getName() == checkPig.getName()) {

    }
    if (myPig.equals(checkPig)) {
      System.out.println("Same!");
      // after override, if they are having same value of attributes, they should be same.
    } else {
      System.out.println("Not same!"); // before override, because equal() implementation from Object.class
    }

    System.out.println(myPig.hashCode()); // 65632
    System.out.println(checkPig.hashCode()); // 65632

    String s = new String("hello");
    String s2 = new String("hello");
    System.out.println(s.equals(s2)); // true
    System.out.println(s.equals("hello")); // true

    System.out.println("hello".toString()); // String.class override toString() method
    System.out.println(myPig); // Pig[age=3, name=ABC]
    // toString()
    // hashCode()

  }
}