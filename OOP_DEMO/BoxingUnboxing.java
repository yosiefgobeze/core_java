package OOP_DEMO;

/*
 * Java is not 100% oop because it uses some primitive data types like int, char .... those data types are not in class and object
 * But java has also wrapper classes for all the primitive data types
 * Boxing is the process of converting a primitive to an object and Unboxing is the reverse
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
        int ageOfFather = 28;
        Integer ageOfSon = new Integer(4); // Integer ageOfSon = 4 is also possible
        int ageOfSonConverted = ageOfSon; // int ageOfSonConverted = ageOfSon.intValue(); -- but unboxing could be auto
        Integer ageOfFatherConverted = ageOfFather; // used the autounboxing

        System.out.println(ageOfFather);
        System.out.println(ageOfSon);
        System.out.println(ageOfFatherConverted);
        System.out.println(ageOfSonConverted);

        String id = "3050";
        int nextId = Integer.parseInt(id) + 1;
        System.out.println(nextId);
    }
}
