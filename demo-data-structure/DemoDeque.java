import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucus"); // addLast
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny");
    // System.out.println(strings); // [Jenny, Luas, Vincent, Oscar]
    // System.out.println(strings.poll()); // pollFirst()
    // System.out.println(strings.pollLast()); // Oscar
    // System.out.println(strings.peek()); // Lucas, peekFirst
    // System.out.println(strings.peekLast()); // Vincent

    // support for loop
    // support remove
    // contains

    // Practice ArrayDeque
 
    Queue<String> ss3 = null;
    int x = 3;
    if (x > 2) {
      ss3 = new ArrayDeque<>();
    } else {
      ss3 = new LinkedList<>();
    }

    ss3.poll(); // Different implementations -> performance according to scenario.

    



  }
}
