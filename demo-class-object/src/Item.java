import java.math.BigDecimal;

public class Item {
  // attributes
  private double price;
  private int quantity;
  private String name;

  // Construction
  public Item(String name, double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
    this.name = name;
  }
  // empty construct
  public Item () {

  }
  
  
  // getter
  public double getPrice() {
    return this.price;
  }
public int getQuantity() {
  return this.quantity;
}
public String getName() {
  return this.name;
}
// setter
public void setQuantity(int quantity) {
  this.quantity = quantity;
}

  public double totalAmount() { // BigDecimal
   return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
    
  }

public static void main(String[] args) {
  Item item = new Item("AA", 3.0, 2);
  System.out.println(item.getPrice());
}


}
