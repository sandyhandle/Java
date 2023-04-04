public class Student
{
  int rollNo;
  String name;
  int[] marks;

    Student (int rollNo, String name, int[]marks)
  {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
  }


  public int printMarks ()
  {
    int sum = 0;
  for (int i:marks)
      {
	sum += i;
      }
    return sum;
  }
}
