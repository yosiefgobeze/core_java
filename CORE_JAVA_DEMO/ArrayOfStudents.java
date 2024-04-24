package CORE_JAVA_DEMO;
public class ArrayOfStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.rollNumber = 1;
        s1.name = "Yosief";
        s1.mark = 92;

        s2.rollNumber = 2;
        s2.name = "Efrem";
        s2.mark = 95;

        s3.rollNumber = 3;
        s3.name = "Aklilu";
        s3.mark = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student student : students) {
            System.out.println(student.name + " : " + student.mark);
        }
    }
}


class Student {
    int rollNumber;
    String name;
    int mark;  
}
