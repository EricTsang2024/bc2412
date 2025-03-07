import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array

// Data case

public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    // System.out.println("Original Array : " + Arrays.toString(my_array));

    int [] newArr = new int[my_array.length] ;
   for (int i = 0; i < my_array.length; i++) {
    if (indexPosition > i && indexPosition < my_array.length-1) {
        newArr[i] = my_array[i];
    } else if(indexPosition == i && indexPosition < my_array.length-1) {
      newArr[indexPosition] = newValue;
    } else if(indexPosition < i && indexPosition < my_array.length-1){
    newArr[i] = my_array[i-1]; 
    } else if(indexPosition == my_array.length -1){
      newArr[i] = my_array[i];
  }
  
    
  }
  System.out.print(Arrays.toString(newArr));

    }
  }
   
    
   
    
    
    
  
  
    // my_array = newArr;
    // System.out.println("New Array: " + Arrays.toString(newArr));
  

