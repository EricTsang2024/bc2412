import java.util.Objects;

public class Book1 {
  private String name;

  public Book1(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
    return true;
    if(!(obj instanceof Book1))
    return false;
    Book1 book = (Book1) obj;
    return Objects.equals(this.name, book.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Book[" //
        + "name=" + this.name //
        + "]";
  }

  
}