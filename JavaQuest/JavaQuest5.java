public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootccccamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    int lastChar = 0;
    boolean found = false;

    
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
        lastChar = i;
        found = true;
         
         }
        }
          if (found) {
            System.out.println("The index of the last character of c is " + lastChar);
          } else {
            System.out.println("Not Found");
          }
    }
    
  }
