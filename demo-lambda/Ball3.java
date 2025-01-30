public class Ball3 {
  private int value;

  public Ball3 addValue(int value) {
    this.value += value;
    return this;
  }

  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Ball3 ball = new Ball3();
    ball = ball.addValue(3);
    ball = ball.addValue(4);
    System.out.println(ball.getValue());
  }
}