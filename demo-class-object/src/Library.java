import java.util.Arrays;

public class Library {
  // A library has many books
  // A Book has attributes, title & author
  // The library has functions:
  // 1) add a Book, return void.
  // 2) removeByTitle, return Book.
  // 3) searchByTitle, return Book[]

  // Librarian (add/remove), Library(search), Book

  private Book[] books;
  // private Librarian librarian;

  // constructor
  public Library() {
    this.books = new Book[0];
  }

  public Book[] getBooks() {
    return this.books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }

  // method signatures


  // Pro-reading:
  // 1. Focus negative cases
  // 2. Variable Scope

  // Search a sub-string of the title
  // What Book object you are going to return?
  public Book[] searchByTitle(String title) { // Didn't change the value of this.books
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title))
        count++;
    }
    Book[] books = new Book[count];
    int idx = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title))
        books[idx++] = this.books[i];
    }
    return books;
  }

  public int size() {
    return this.books.length;
  }

  public static void main(String[] args) {
    // Book
    // Library
    // Librarian
    Library lb1 = new Library();
    Librarian lbn = new Librarian(lb1);
    lbn.add(new Book("ABC", "Tommy"));
    lbn.add(new Book("DEF", "Jenny"));
    lbn.add(new Book("ABCD", "Jimmy"));

    for (Book book : lb1.getBooks()) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    // ABC Tommy
    // DEF Jenny
    // ABCD Jimmy
    
    for (Book book : lb1.searchByTitle("BC")) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    // ABC Tommy
    // ABCD Jimmy

    Book removedBook = lbn.removeByTitle("DEF");
    System.out.println(removedBook.getTitle() + " " + removedBook.getAuthor()); // DEF Jenny
    System.out.println(lb1.size()); // 2
  }


}