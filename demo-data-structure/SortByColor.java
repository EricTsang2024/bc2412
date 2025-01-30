import java.util.Comparator;

// Sort: RED -> BLUE -> YELLOW
public class SortByColor implements Comparator<Ball2> {
  @Override
  public int compare(Ball2 b1, Ball2 b2) {
    // b1 (-1), b2 (1)
    if (b1.getColor() == Ball2.Color.RED)
      return -1;
    if (b2.getColor() == Ball2.Color.RED)
      return 1;
    if (b1.getColor() == Ball2.Color.BLUE)
      return -1;
    return 1;
  }
}