import java.util.Comparator;

public class SortByValue implements Comparator<Ball2> {
  @Override
  public int compare(Ball2 b1, Ball2 b2) {
    return b1.getValue() > b2.getValue() ? -1 : 1;
  }
}