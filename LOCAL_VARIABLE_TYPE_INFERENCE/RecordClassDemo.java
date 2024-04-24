package LOCAL_VARIABLE_TYPE_INFERENCE;

/*
 * some classes might be created just for the purpose of storing values which do not have to change
 * in such a case java has introduced record class which makes codes minimized
 * the instance variables are final so they can't be changed
 * by default the toString(), hashcode() and equals() methods are implemented and no need to do again
 */
public class RecordClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Temesghen", 40);
        Student s2 = new Student(1, "Biniam", 39);
        Student s3 = new Student(2, "Abiel", 32);
        Student s4 = new Student(3, "Naod", 28);

        // for a normal class the below codes would have different results
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

/**
 * InnerRecordClassDemo
 */
record Student(int id, String name, int age) {
}
