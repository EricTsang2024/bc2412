public class ArrayList1<T> {
  private T[] values;

  public ArrayList1() {
    this.values = (T[]) new Object[0];
  }

  public void clear() {
    // this.values = null;
    this.values = (T[]) new Object[0];
  }

  public boolean add(T value) {
    // for (int i = 0; i < this.values.length; i++) {
    //   if (this.values.equals(value))
    //     return false;
    // }
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
    return true;
  }

  public int size() {
    return this.values.length;
  }

  public static void main(String[] args) {
    ArrayList1<Book1> books = new ArrayList1<>();
    books.add(new Book1("ABC"));
    books.add(new Book1("IJK"));
    System.out.println(books.size());
  }

}