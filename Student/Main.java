/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
    int[] marks1 = { 89, 89, 89, 89, 54 };
    int[] marks2 = { 89, 89, 56, 89, 98 };
    int[] marks3 = { 89, 89, 54, 89, 21 };
    int[] marks4 = { 89, 89, 54, 89, 98 };
    int[] marks5 = { 89, 21, 89, 32, 98 };
    Student id_1 = new Student (1, "Santhosh", marks1);
    Student id_2 = new Student (2, "Ranjith", marks2);
    Student id_3 = new Student (3, "usha", marks3);
    Student id_4 = new Student (4, "Ram", marks4);
    Student id_5 = new Student (5, "Sitha", marks5);

    System.out.println (id_5.printMarks ());

  }


  static boolean checkTwoNumber (int n)
  {
    if (n < 100 && n > 9)
      {
	return true;
      }
    return false;
  }
}
