package comparing;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Student santhosh = new Student(4,87.6);
        Student priya = new Student(3,89.6);
        Student ranjith = new Student(8,85.6);
        Student preethi = new Student(9,57.5);
        Student sowmiya = new Student(18,83.6);

        Student[] students = {santhosh,priya,ranjith,preethi,sowmiya};

//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++){
            list.add(i * 5);
        }

        System.out.println(list);
        list.forEach((a,b) ->  System.out.println(a + ", " + b) );

//        int sum = (int a, int b) -> (a + b);


    }
}
