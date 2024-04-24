package OOP_DEMO;

public class ConstructorDemo {

    public static void main(String[] args) {
        // create a Student object using a default constructor and a parameterized one
        Student st1 = new Student();
        System.out.println(st1.age + ": " + st1.name + ": " + st1.score);
        Student st2 = new Student(20, "Mekseb", 95);
        System.out.println(st2.age + ": " + st2.name + ": " + st2.score);
    }
    
}

class Student{
    int age;
    String name;
    double score;

    public Student(){
        System.out.println("No default values....");
    }

    public Student(int age, String name, double score){
        this.age = age;
        this.name = name;
        this.score = score;
    }


}
