
public class Book
{

  int id;
  String bookName;
  String author;


    Book (int id, String bookName, String author)
  {
    this.id = id;
    this.bookName = bookName;
    this.author = author;
  }

  public void bookDetails ()
  {
    System.out.println ("Book Id :- " + id);
    System.out.println ("Book Name :- " + bookName);
    System.out.println ("Author Name :- " + author);
  }

}

