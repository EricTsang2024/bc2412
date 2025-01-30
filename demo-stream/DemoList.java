import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // new ArrayList<>()
    // List.of()
    // Arrays.asList()

    // 1. new ArrayList<>()
    // Able to add/remove/modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("ABC");
    strings1.add("DEF");
    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF"));
    strings2.add("IJK");
    strings2.remove("DEF");
    strings2.set(0, "XYZ");

    // 2. Arrays.asList()
    // Cannot add and remove. Able to modify element ONLY.
    List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
    // strings3.add("XYZ"); // java.lang.UnsuppotedOperationException
    // strings3.remove("IJK"); // java.lang.UnsuppotedOperationException
    strings3.set(0, "OPQ");

    // 3. List.of()
    // Able to read ONLY.
    List<String> strings4 = List.of("ABC", "DEF", "IJK");
    // strings4.add("XYZ")
    // string4.remove("ABC")
    // string4.set(0, "LLL")
    System.out.println(strings4.get(2));
  }
}