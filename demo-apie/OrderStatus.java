public enum OrderStatus {
  PAID(1), READY_FOR_SHIP(2), DELIVERING(3), DELIVERED(4),;

  private int value;

  private OrderStatus(int value) {
    this.value = value;
  }

  // DELIVERED.next() -> null
  public OrderStatus next() {
    for (OrderStatus orderStatus : OrderStatus.values()) {
      if (orderStatus.value == this.value + 1)
        return orderStatus;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.READY_FOR_SHIP.next()); // toString()
    System.out.println(OrderStatus.PAID.name());

    System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); // true
    
    // java.lang.IllegalArgumentException
    // System.out.println(OrderStatus.valueOf("paid") == OrderStatus.PAID); 
    
  }
}