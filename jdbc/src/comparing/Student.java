package comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    double mark;

    public Student(int rollNo, double mark) {
        this.rollNo = rollNo;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.rollNo - o.rollNo);
    }

    @Override
    public String toString() {
        return mark + "";
    }
}
