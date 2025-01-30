public class DemoInnerClass { // Outer Class
  private int x;

  public void setX(int x) {
    this.x = x;
  }

  public void print() {
    // Outer Class cannot read the inner class object attribute
    // System.out.println("Outer.print(): x=" + this.x + ",y=" + y);
    System.out.println("Outer.print(): x=" + this.x);

    // Local Class
    class Cat {
      private int age;

      public Cat(int age) {
        this.age = age;
      }

      public int getAge() {
        return this.age;
      }
    }
    Cat cat = new Cat(10);
    System.out.println(cat.getAge()); // 10
  }

  public static class Library { // static nested class

  }

  public static class Builder { // static nested class

  }

  public class Student { // inner class
    private int y;

    public void print() {
      // Student object is able to read outer class object attribute directly
      System.out.println("Student.print(): x=" + x + ",y=" + this.y);
    }

    public void setY(int y) {
      this.y = y;
    }
  }

  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();

    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student(); // NOT Parent-Child relationship

    dic.setX(10);
    student.setY(20);
    dic.print(); // Outer.print(): x=10
    student.print(); // Student.print(): x=10,y=20

    // Anonymous Inner Class (before Java 8)
    Swimable person = new Swimable() {
      int count = 0;

      @Override
      public void swim() {
        this.count++;
        System.out.println("Anonymous Object");
      }

      // public int getCount() {
      //   return this.count;
      // }
    };
    // person.getCount(); // Static Polymorphism
    // But if you create Person.class implements Swimable, 
    // then the person object may contain additional methods

    // Lambda Expression (after Java 8)
    Swimable person2 = () -> System.out.println("Lambda Expression Object");
  }

  @FunctionalInterface
  private static interface Swimable {
    void swim();
  }
}