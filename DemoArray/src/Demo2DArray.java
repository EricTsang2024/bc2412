import java.util.Arrays;

public class Demo2DArray {
public static void main(String[] args) {
  int [] arr = new int [3];
  arr [0] = 1;
  arr [1] = 2;
  arr [2] = 3;

  for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
  }
  System.out.println(Arrays.toString(arr));
   
  // excel (row x column) 
  int [] [] arr2d = new int [2] [3];
  // row: 0, 1
  // column: 0, 1, 2
  // 1st row, 1st column
  arr2d [0] [0] = 100;
  // 2nd row, 3rd column, 100
  arr2d [1] [2] = 100;

  // arr2d [i] -> an array
  for ( int i = 0; i < arr2d.length; i++) { // how many rows = arr2d.length
      for (int j = 0; j < arr2d[i].length; j++) { // how many colums = arr2d [i].length
        System.out.println(arr2d[i][j]);
      }
  }
    // 1st row -> {100, 0, 0}
    // 2nd row -> {0, 0, 100}
    int [][] arr2d2 = new int [] [] {{100, 0, 0}, {0, 0, 100}};
    System.out.println(Arrays.deepToString(arr2d2)); // [[100, 0, 0], [0, 0, 100]]

    int [][] arr2d3 = new int[][] {{100, 7, 9}, {101, -9, 100}};
    int rowMaxs = new int [arr2d3.length];
    int idx = 0;
    // Find the max value for each row, and then put it into a new int array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr2d3.length; i++) { // how manys rows = arr2d.length
        max = Math.max(arr2d3[i][j], max);
      for (int j = 0; j < arr2d3[j].length; j++) {
          
          if (arr2d3[j] > max) {

          }
      }
    }
}
}