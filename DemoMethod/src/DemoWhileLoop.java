import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {

    // check if duplicated exists


  
  public static void main(String[] args) {
    // for (int i = 0; i < 3; i++) {
    //   System.out.println(i);
    // }

    // ! While Loop vs For Loop
    // int j = 0; // ! 1. declare the counter outside the loop
    // while (j < 3) { // continue criteria
    //  System.out.println(j);
    //   j++; // ! 2. flexible to control the j
    //    }

    // String s = "hello";
    // char target = 'e';
    int count = 0;
    // // boolean found = false;
    // // while
    // int i = 0;
    // while (i < s.length()) {
    //   if (s.charAt(i)== target) {     
    //     count++;       
    //   }      
    //   i++;
    // }
    //  System.out.println(count);

    // for ( int i = 0; i < s.length(); i++) {
    //   if (s.charAt(i)== target) {
    //     count++;
    //   }
    // }
    // System.out.println(count);

    // Random
    // int number = new Random().nextInt(3); // 0 - 2
    // System.out.println(number);

    int value = new Random().nextInt(49) + 1; // ( 0 - 48) + 1
    // System.out.println(value);

    // 1 - 49
    int [] marksixArr = new int[6];

   while (count < 6); {
      value = new Random().nextInt(49) + 1; // 1 - 49
      if (!isDuplicated(marksixArr, value)) {
        count++;
      }

   }System.out.println(Arrays.toString(marksixArr));
       // random: 18, 39, 8, 25, 28, 47
       public static boolean isDuplicated(int[] arr, int newValue) {
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == newValue)
          return true;
        }
    
        return false;
      }
      }

    // check if duplicated exists

  // public static boolean isDuplicated(int[] arr, int newValue) {
  //   for (int i = 0; i < arr.length; i++) {
  //     if (arr[i] == newValue)
  //     return true;
  //   }

  //   return false;
  // }
   
    
  // 1 - 100
  // bomb: 47
  // ! Game Starts:
  // Please pick a number between 1 - 100
  // user: 4
  // Please pick a number 5 - 100
  // user: 67
  // user: 47
  // Bomb!

  // While, Scanner, Random
    int min = 1;
    int max = 100;
        int bomb = new Random().nextInt(max) + 1; // 1 - 100
     int input = -1;
     while (bomb != input) {
      System.out.println("Please pick a number between");
      Scanner scanner = new Scanner (System.in);
      input = scanner.nextInt();
      if (input < min || input > max) {
        continue;
      }
    // min, max 
    if (input < bomb) {
      min = input + 1;
    } else {
      max = input - 1;
    }
    }
    }

      



    
  


