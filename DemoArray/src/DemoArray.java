import java.math.BigDecimal;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int x1 = 3;
    int x2 = 10;
    int x3 = 11;

    // declare array
    int[] arr = new int[3];
    // assign value to array
    arr[0] = 3;
    arr[1] = 10;
    arr[2] = 11;
    // for loop -> read array values
    // Print all values, which >= 10
    for (int i = 0; i < arr.length; i++) {// i = 0, 1, 2
      if (arr[i] >= 10) {
        System.out.println(arr[i]);
      }
    }
    // declare double array, length = 5
    // assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
    // Sum up all values in the double array
    double[] arr1 = new double[5];
    arr1[0] = 10.4;
    arr1[1] = 4.3;
    arr1[2] = 3.3;
    arr1[3] = 1.9;
    arr1[4] = 9.9;

    double sum = 0;
    for (int a = 0; a < arr1.length; a++) {
      sum = sum + arr1[a];

    }
    System.out.println(sum);
    // "abc", "def","ijk"
    // "abc"
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";


    String target = "abc";
    boolean isTargetExist = false;
    for (int i = 0; i < arr3.length; i++) {
      if (target.equals(arr3[i])) {
        isTargetExist = true;
      }
    }

    System.out.println(isTargetExist); // true

    char[] arr4 = new char[] {'b', 'c', 'a'};
    arr4[0] = 'b';
    arr4[1] = 'c';
    arr4[2] = 'a';
    int[] ascii = new int[arr4.length];

    for (int i = 0; i < arr4.length; i++) { // 0, 1, 2
      ascii[i] = arr4[i]; // char value -> int variable
    }
    for (int i = 0; i < ascii.length; i++) {
      System.out.println(ascii[i]);
    }

    // convert the char value to int value, and then assign them to a new int array
    // 98, 99, 97

    // Find the max ascii value in the int array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < ascii.length; i++) {
      if (ascii[i] > max) {
        max = ascii[i];
      }
    }
    // Step 1: i = 0 98 > 0 -> true -> put 98 to max
    // Step 2 : i = 1, 99 > 98 -> true -> put 99 to max
    // Step 3: i = 2, 97 > 98 -> false -> exit
    System.out.println(max); // 99

    // System.out.println(max); // 99

    // Find the min value in the int array
    int[] arr5 = new int[] {9, 8, 99, 98};
    int min = Integer.MAX_VALUE; // int max value
    for (int i = 0; i < ascii.length; i++) {
      if (ascii[i] < min) {
        min = ascii[i];
      }
    }
    System.out.println(min);


    // array -- sum all elements
    int[] arr6 = new int[] {9, 8, 99, 98};
    for (int i = 0; i < arr6.length; i++) {
      sum = sum + arr6[i];
    }
    System.out.println(sum);

    // swap
    int left = 7;
    int right = 9;
    int temp = left; // backup left
    left = right;
    right = temp;
    System.out.println(left);
    System.out.println(right);

    // array
    int[] arr8 = new int[] {9, -8, 109, 99, 98};
    for (int i = 0; i < arr8.length - 1; i++) {
      System.out.println(arr8[i] + arr8[i + 1]);
    }

    // print 1 (9 + -8)
    // print 101 (-8 + 109)
    // ...
    // print 197 (99 + 98)



    int[] arr7 = new int[] {9, -8, 109, 99, 98};
    // // move max value to the tail
    // // for loop + swap
    // 9, -8, 109, 99, 98
    // -8, 9, 109, 99, 98
    // -8, 9, 109, 99, 98
    // -8, 9, 99, 109, 98
    // -8, 9, 99, 98, 109
    for (int i = 0; i < arr7.length - 1; i++) {
      if (arr7[i] > arr7[i + 1]) {
        temp = arr7[i]; // backup
        arr7[i] = arr7[i + 1];
        arr7[i + 1] = temp;
      }
    }



    System.out.println(Arrays.toString(arr7)); // [x, x, x, x, 109]

    Integer[] arr11 = new Integer[] {9, 6, 4};
    // Products for all numbers
    int product = 1;
    for (int i = 0; i < arr11.length; i++) {
      product *= arr11[i];
    }
    System.out.println(product); // 216

    double[] prices = new double[] {8.2, 6.5, 10.5};
    int[] quantities = new int[] {9, 8, 3};
    // 8.2 x 9 + 6.5 x 8 + 10.5 x 3
    double totalAmount = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];

    }
    System.out.println(totalAmount); // 157.3

    String s = String.valueOf(123);
    System.out.println(s);// "123"
    s = String.valueOf(true);
    System.out.println(s); // "true"

    System.out.println(String.valueOf('A')); // "A"

    Integer i1 = Integer.valueOf("123");
    System.out.println(i1); // 123

    // Integer i2 = Integer.valueOf("h"); // java.lang.NumberFormatException

    // "hello" -> 'h' 'e' 'l' 'l' 'o'
    char[] chArr = "hello".toCharArray();
    System.out.println(chArr);
    System.out.println(chArr[0]);
    System.out.println(chArr[1]);

    // olleh
    char cTemp;
    for (int i = 0; i < chArr.length / 2; i++) {
      // chArr [i] vs chArr[chArr.length - i]
      cTemp = chArr[i];
      chArr[i] = chArr[chArr.length - i - 1];
      chArr[chArr.length - i - 1] = cTemp;
    }
    String result = "";
    for (int i = 0; i < chArr.length; i++) {
      result += chArr[i];
    }
    System.out.println(result); // olleh

    // h -> i, e-> f, l -> m, o -> p
    // ifmmp
    chArr = "hello".toCharArray();
    for (int i = 0; i < chArr.length; i++) {
      chArr[i] = (char) (chArr[i] + 1);
    }
    System.out.println(String.valueOf(chArr)); // "ifmmp", char Array -> String

    char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
    // more than one loop

    
    int[] counters = new int[26];
    for (int i = 0; i < arr12.length; i++) {
      counters[arr12[i] - 'a']++; // counters [arr12[i]] + 1
    }
    int max2 = Integer.MIN_VALUE;
    char maxNumChar = ' ';
    for (int i = 0; i < counters.length; i++) {
      // max = Math.max(counters[i], max);
      if (counters[i] > max2) {
          max2 = counters [i];
          maxNumChar = (char) (i + 97);
      }
    }
    
    // p - a ->

    System.out.println(maxNumChar);// p
  }
}

