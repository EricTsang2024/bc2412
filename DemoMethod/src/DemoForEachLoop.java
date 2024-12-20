public class DemoForEachLoop {
public static void main(String[] args) {
  // for loop, while loop, for-each loop
  int [] arr = new int [] {3, 4, 5};

  // Just get one value for each iteration
  for (int i = 0; i < arr.length; i++) { 
    System.out.println(arr[i]);
  }

  // 3 + 4
  // 4 + 5
  for (int i = 0; i < arr.length-1; i++) { 
    System.out.println(arr[i] + arr[i + 1]);
      }    

      // for - each
    for (int integer : arr) { // Just get one value for each iteration
      // 10000 Lines .......
      System.out.println(integer);
    }

    char [] arr2 = new char[] {'p', 't', 'e'};
    // for-each loop -> "pte"
    String s = "";
    for(char chara  : arr2) {
      s += chara;
    }
      System.out.println(s);

      String[] arr3 = new String[] {"abc", "ijk", "def"};
      String target = "ijk";
      boolean found = false;
      // true
      for(String s1 : arr3 ) {
        if (arr3.equals(target)) {
          found = true;
        }
      }
      System.out.println(found);

      // int [] nums = new int[] {3, 4, 5};
      // for ( int num : nums) { // num = nums[i]
          
      // }


} 
}
