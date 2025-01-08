import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
public class Practice <T> {
  
  private T value;

  public void setValue (T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }



   public static void main(String[] args) {
   Practice <int[]> x1 = new Practice<>();
   x1.setValue(new int[] {1,2,3});
   System.out.println(Arrays.toString(x1.getValue()));
   

      
            


        
        
    
       }
     
      }
    
