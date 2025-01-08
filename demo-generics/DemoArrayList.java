import java.util.ArrayList;

public class DemoArrayList {
public static void main(String[] args) {
    // Many String = String[]

    // Variable Length
    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());
    System.out.println(strings.get(1));
    // System.out.println(strings.get(2)); // java.lang.IndexOutOfBoundsException

    // Book[]
    ArrayList<Book1> books = new ArrayList<>();
    books.add(new Book1("ABC"));
    books.add(new Book1("IJK"));
    books.remove(0); // remove book by index
    System.out.println(books.size()); // 1
    books.add(new Book1("XYZ"));
    books.remove(new Book1("IJK")); // after @Override equals() in Book.class
    // ArrayList.remove(Object obj) -> Book.equals()
    // Generics Design ensure the Type must contains equals()
    System.out.println(books.size()); // 1

    // Requires @Override equals()
    System.out.println(books.contains(new Book1("XYZ"))); // true
    System.out.println(books.indexOf(new Book1("XYZ"))); // 0
    books.clear(); // Create a new array with size 0
    System.out.println(books.add(new Book1("ABCD"))); // true

    System.out.println(books.isEmpty());
    boolean found = false;
    String bookName = "Not Found";
    for (Book1 book : books) {
      if (book.getName().contains("BC"))
        // found = true;
        bookName = book.getName();
      break;
    }
    System.out.println("Book " + bookName + " is available.");  
  }


}


