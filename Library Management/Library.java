import java.util.ArrayList;

public class Library
{
  public static void main (String[]args)
  {

    ArrayList < Book > books = new ArrayList < Book > ();

    books.add (new Book (1, "Attached", "Dr. Amir"));
    books.add (new Book (2, "Help", "Santhosh"));
    books.add (new Book (3, "Brave", "Ranjith"));
    books.add (new Book (4, "The Girls", "Vasuki"));
    
    
    ArrayList<User> users = new ArrayList < User>();
    
    
    // for( int i = 0; i < 4; i++){
    //     System.out.println(books.get(i).bookName);
    // }
    users.add ( new User(1,"Priya",books.get(1)));
    for (User i: users){
        i.userDetails();
        System.out.println("*************");
    }


  }
}
