import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        // Add value 0.1 to each of value in array arr16
        // Print: [0.3, 0.4, 0.6]
        // Use: BigDecimal
    
        BigDecimal newValue =  BigDecimal.valueOf(0);
        float arr [] = new float [] {0.2f, 0.3f, 0.5f};
        BigDecimal arr1 [] = new BigDecimal[arr.length];
        for (int i = 0; i < arr.length; i++) {
           newValue = BigDecimal.valueOf(arr[i]).add(BigDecimal.valueOf(0.1)); 
           arr1[i] = newValue.setScale(1, RoundingMode.HALF_UP);                    
          
        }
    System.out.println(Arrays.toString(arr1));

    
    }
           
    }

