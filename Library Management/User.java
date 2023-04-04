import java.util.ArrayList;

public class User
{

  int userId;
  String userName;
  boolean card = true;
  ArrayList<Book> books = new ArrayList<Book>();


    User (int userId, String userName, Book book)
  {
    this.userId = userId;
    this.userName = userName;
    this.books.add(book);
  }

  public void userDetails ()
  {
    System.out.println ("user Id :- " + userId);
    System.out.println ("user Name :- " + userName);
    System.out.println ("Card Activity :- " + ((card)?"Active":"InActive")) ;
    
    System.out.println("No of Books the user have");
    
    for (Book i : books){
        System.out.println(i.bookName);
        
    }
    System.out.println("******");
  }

}

