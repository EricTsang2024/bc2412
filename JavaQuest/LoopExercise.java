import java.math.BigDecimal;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String s = "hello";
    for (int i = 0; i < s.length() + 1; i++) {
      System.out.println(s);
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    int max = 21;
    for (int i = 2; i < max; i++) {
      if (i % 2 == 0 && i > 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i < 21; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println(i);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i < 16; i++) {
      sum += i;
    }
    System.out.println(sum);
    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int oddSum = 0;
    int evenSum = 0;
    int product = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        evenSum = sum += i;
      } else if (i % 2 == 1) {
        oddSum = sum += i;
      }
      product = oddSum * evenSum;
    }
    System.out.println(product);
    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    boolean found = false;
    char character = 'd';
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == character) {
        found = true;
        break;
      }
    }
    if (found == true) {
      System.out.println("d is found");
    } else {
      System.out.println("d is not found");
    }


    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
      String s8a = "abcba";
      String s8b = "cba";
      boolean isSubstringExist = false;
      for ( int i = 0; i < s8a.length() - s8b.length() + 1; i++) {
        if (s8a.substring(i, i + s8b.length()).equals(s8b)) {
          isSubstringExist = true;
          break;
        }
      }
     System.out.println(isSubstringExist);

    // }       
    //     if (isSubstringExist == true) {
    //       System.out.println("s8b is a substring.");
    //     } else {
    //       System.out.println("s8b is not a substring.");
        // }
    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i)== c9) {
          count++;
      }
    } 
    System.out.println("count = "+count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    // for (int i = 0; i < arr10.length; i++) {
    //   if (arr10.)
    // }
    // System.out.println(arr10.replace('k', 'x'));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    // String s11 = "kLKloOOu";
    // int counting = 0;
    // for (int i = 0; i < s11.length(); i++) {
    //   if (s11.toUpperCase()
    // }

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    int n = 3;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14 [0] = 1;
    arr14 [1] = 4;
    arr14 [2] = 9;
    arr14 [3] = -4;


    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max1 = Integer.MIN_VALUE;
    long min1 = Integer.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
        if (arr14[i] > max1){
          max1 = arr14[i]; 
        } else if (arr14[i] < min1) {
          min1 = arr14[i];
        }               
    }
        System.out.println(min1);
        System.out.println(max1);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
      float arr16 [] = new float [] {0.2f, 0.3f, 0.5f}; 


    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    // Use: BigDecimal
  
    // double arr17[] = new double float arr16[]; 
    // BigDecimal bd1 = BigDecimal.valueOf(0.1);
    // for (int i = 0; i < arr16.length; i++) {
    //   BigDecimal newValue = BigDecimal.valueOf((arr16[i]).add(bd1));
     
      
    // }

    //   BigDecimal bd2 = BigDecimal.valueOf(arr16[0]);
    //   BigDecimal bd3 = bd1.add(bd2);
    //   BigDecimal bd4 = BigDecimal.valueOf(arr16[1]);
    //   BigDecimal bd5 = bd1.add(bd4);
    //   BigDecimal bd6 = BigDecimal.valueOf(arr16[2]);
    //   BigDecimal bd7 = bd1.add(bd6);
      // System.out.println(bd3.doubleValue());
    //   System.out.println(bd5.doubleValue());
    //   System.out.println(bd7.doubleValue());
      


    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    int count2 = 0;
    // Print "count name=2"
    for ( int i = 0; i < arr18.length; i++) {
      if( arr18[i].equals(target)) {
          count2++;
      }
    }
        System.out.println("count name = " + count2);
    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";    
    char chars [] = s19.toCharArray();
    char temp = ' ';
    temp = chars[1];
    chars[1] = chars[s19.length()-1];
    chars[s19.length()-1] = temp;
    String swapText = new String(chars);
    System.out.println(swapText);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};

  }
}