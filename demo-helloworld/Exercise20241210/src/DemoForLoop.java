public class DemoForLoop {
  public static void main(String[] args) {
    // 2^100
    // int x =2;
    // x = x * 2;
    // x *= 2;
    // System.out.println(x);

    // For loop

    // for ( ; ; ) {
    // }

    // "i < 3" -> continue criteria
    // "i++" -> modifier
    // ! You have to let the modifier work with "continue criteria",
    // ! so that continue crteria at the end become false
    // for (int i = 0; i < 3; i++) {
    // System.out.println("hello");
    // }
    // Step 1: int i = 0;
    // Step 2: i < 3 (question) -> true
    // Step 3: if true, enter into code block & print hello
    // Step 4: i++, i become 1
    // Step 5: i < 3 (question) -> true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: i < 3 (question) -> true
    // Step 9: if true, print hello
    // Step 10: i++, i become 3
    // Step 11: i < 3 (question) -> false
    // Step 12: exit for loop

    // for(int i = 0; i < 5; i++){ // 0,1,2,3,4
    // System.out.println(i);
    // }

    // print even numbers (i % 2 == 0)
    // for (int i = 0; i < 10; i++) {
    // if (i % 2 == 0) { // even number definition
    // System.out.println(i);
    // }
    // }

    // // print 0 - 100, divided by 3 and divided by 4
    // // for + if
    // for (int y = 0; y < 101; y++){
    // if (y % 3 == 0 && y % 4 == 0) {
    // System.out.println(y);
    // }
    // }

    // sum up 0 - 20: 0 + 1 + 2 ...+ 20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      sum += i; // sum = sum + i;
    }
    System.out.println(sum);
    // System.out.println(i); // ! is declared within the for loop

    // sum up all odd numbers between 0 - 10
    // sum up all even numbers between 0 - 10
    // ! Find the difference between evenSum and oddSum -> positive number


    int oddSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) { // odd number definition
        oddSum = oddSum + i;

      }
    }
    System.out.println(oddSum);

    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      }
    }
    System.out.println(evenSum);

    // int diff = -1;
    // // if (oddSum > evenSum) {
    // diff = oddSum - evenSum;
    // } else{
    // diff = evenSum - oddSum;
    // }
    int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    // System.out.println(diff); // 5



    // Searching
    String str = "abcdefijk";

    // 1. Check if 'd' exists in the string
    // for loop + if + charAt
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd')
      {
        found = true;
        break; // break the nearest loop
      }
    }
    System.out.println(found);



    // 1. "abcdefijk"
    // 2. "abcefilk"
    // 3. ""
    // 4. "abcdefijkd"

    // 2. check if the string value contains given sub-string
    String substr = "lo";
    String str2 = "hello";
    // for loop + substring
    // hel vs loq
    // ell vs loq
    // llo vs loq

    boolean isSubstringExist = false;
    for (int i = 0; i < str2.length() + 1; i++) {
      if (str2.substring(i, i + substr.length()).equals(substr)) {
        isSubstringExist = true;
        break;
      }
    }
    System.out.println(isSubstringExist);

    // Counting

    // Count the number of 'l'
    // for + if

    // Data case (! forget to consider empty string)
    // 1. Setup for loop criteia
    // 2. check if 'l' exist in string
    // 3. sum the found 'l'
    // 4. Since require to check full "string" for counting, so do not use break this time
    String s = "hello";
    int count = 0;
    for (int i = 0; i < s.length(); i++) { // loop all values + filtering
      if (s.charAt(i) == 'l') {
        count++;

      }
    }
    System.out.println(count);

    // continue - skip the rest, go to nexr iteration
    count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != 'l') {
        continue; // skip count++, go to i++
      }
      count++;
    }
    System.out.println(count);

    // 1-100, print all numbers, which can be divided by 3 and 4
    // continue

    // Data case
    // Assign result to int
    // forget to notice 1-100, so int i supposed be 1 (i=1)



    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 4 != 0 // event 1
          || i % 4 == 0 && i % 3 != 0 // event 2
          || i % 3 != 0 && i % 4 != 0 // event 3
      ) {
        continue; // skip print
      }

      System.out.println(i);

    }



    // Nested Loop
    // for (int i = 0; i < 3; i++) { // outer loop
    // for (int j = 0; j < 4; j++) { // inner loop
    // System.out.print("*");
    // }
    // // go to i++
    // }
    // Step 1: i = 0, j = 0, print*
    // Step 2: i = 0, j = 1, print*
    // Step 3: i = 0, j = 2, print *
    // Step 4: i = 0, j = 3, print *
    // Step 5: i = 1, j = 0, print *
    // Step 6: i = 1, j =1, print *
    // Step 7: i = 1, j = 2, print *
    // Step 8: i = 1, j = 3, print *
    // Step 9 : i =2, j = 0, print *
    // Step 10 : i =2, j = 1, print*
    // Step 11 : i = 2, j =2 print *
    // Step 12: i =2, j = 3 print *

    // *
    // **
    /// *** --> variables do not input actual numbers
    /// **** --> two pattern two mission so need two for loops
    int n = 4;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i +1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }


  }
}
