import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

  public class Practice {

    private int age;
    private String name;

    public Practice(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

  @Override
  public String toString() {
    return "I am "+ this.age
    + " years old and my name is "
    + this.name+" .";
  }
  

  public static void main(String[] args) {
    Practice p1 = new Practice("AAA", 8);
    System.out.println(p1);



  }

}

