/**
 * Purpose:
 * @author vincent.lau
 * @since
 * @version
 * Date:
 */
public class Person2 {
  private String name;
  private int age;

  public static Builder builder() {
    return new Builder();
  }

  // public Person2(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  private Person2(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static class Builder {
    private String name;
    private int age;

    // setter
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    // setter
    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person2 build() {
      return new Person2(this);
    }
  }

  public static void main(String[] args) {
    // Person2 p1 = new Person2("Vincent", 18);
    // Person2 p3 = new Person2(null, 18); // not a good idea to pass null

    // advantages:
    // 1. You no longer need to pass null for those unnecessary attribute
    // 2. If there are many attribute (i.e. 20+ String), you have to manually check if the value is
    // passed to the right parameters
    Person2 p2 = Person2.builder() //
        .name("Vincent") //
        .age(18) //
        .build();
    System.out.println(p2.getAge()); // 18
    System.out.println(p2.getName()); // Vincent
    p2 = Person2.builder().age(11).build();
    System.out.println(p2.getAge());

    Person2 p4 = Person2.builder().build();
    System.out.println(p4.getAge()); // 0
    System.out.println(p4.getName()); // null
  }
}