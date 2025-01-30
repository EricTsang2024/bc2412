public class DemoFactory {

  public static void main(String[] args ) {
    FurnitureFactory factory = new ModernFurnitureFactory();
    
    
    // Runtime Polymorphism
    Chair modernChair = new ModernChair();
    Chair victoriaChair = new victoriaChair();
    System.out.println(modernChair.sitOn());
    System.out.println(modernChair.hasLegs());
    


  }
}
