package COLLECTION_DEMO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOnCustomClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Haben"));
        students.add(new Student(17, "Semhar"));
        students.add(new Student(15, "Temelso"));
        students.add(new Student(21, "Ambesajer"));
        students.add(new Student(16, "Kflezghi"));
        List<Integer> ages = new ArrayList<>();

        for (Student student : students) {
            ages.add(student.getAge());

        }

        Comparator<Student> com = (Student s1, Student s2) -> {
                    return (s1.getAge() > s2.getAge()) ? 1 : -1;
                };

        Collections.sort(students, com);
        for (Student student : students) {
            System.out.println(student);
        }

        
    }
}

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int getAge(){
        return this.age;
    }
    
}
