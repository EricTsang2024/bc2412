import java.util.List;
import java.util.Vector;

// Solution
// 1. Native Data strucuture (Vector)
// 2. Lock the action (synchronized)
public class DemoThread4 {
  private List<Integer> integers; // Not thread-safe

  public DemoThread4() {
    this.integers = new Vector<>(); // Polymorphism
  }

  // public ArrayList<Integer> getIntegers() {
  // return this.integers;
  // }

  public boolean add(Integer integer) {
    return this.integers.add(integer); // lock the line of code
  }

  public int size() {
    return this.integers.size();
  }

  // add
  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();

    Runnable addMillionElements = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        central.add(i);
      }
    };

    Thread workerB = new Thread(addMillionElements);
    workerB.start(); // main thread initialize another thread (workerB) to execute the task.
    // The workerB execute the task ONLY.

    Thread workerC = new Thread(addMillionElements);
    workerC.start();

    // Main Thread
    try {
      workerB.join(); // main thread wait until workerB complete the task
      workerC.join(); // main thread wait until workerC complete the task
    } catch (InterruptedException e) {

    }
    System.out.println(central.size());
  }
}