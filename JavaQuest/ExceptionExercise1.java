import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print ""Division operation completed.""


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter denominator: ");
    int denominator = scanner.nextInt();
    scanner.close();

    // code here ...
    double answer = 0.0;
    try {
      answer = BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(denominator)
      ,2,RoundingMode.HALF_DOWN)
      .doubleValue();
      System.out.println(answer);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero.");
    } finally {
      System.out.println("Division operation completed");
    }


    
    
  }
}