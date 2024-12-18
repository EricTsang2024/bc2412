public class DemoSwitch {
  public static void main(String[] args) {

    int x = 3;
    if (x == 1) {
      System.out.println("x = 1");
    } else if (x == 2) {
      System.out.println("x = 2");
    } else if (x == 3) {
      System.out.println("x = 3"); // print
    } else {
      System.out.println("somethings else...");
    }


    // switch
    switch (x) { // only checking x == ?
      case 1: // (unable to case > 1) but if can use (if > 1) for filtering
        System.out.println("x=1");
        break;
      case 2:
        System.out.println("x=2");
        break;
      case 3:
        System.out.println("x=3");
        break;
      default:
        System.out.println("something else...");

    }


    char gender = 'M'; // F, M (Well defined value range) and not friendly for many cases like hundurad cases
    switch (gender) {
      case 'M':
      System.out.println("Male");
      break;
      case 'F':
      System.out.println("Female");
      break;
      default:
      System.out.println("unknown");

    }
  }
}
