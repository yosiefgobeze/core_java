package OOP_DEMO;

public class EnumerationDemo {
    public static void main(String[] args) {
        ServerStatus s = ServerStatus.RUNNING;
        System.out.println("Server status: "  + s);

        // to print all the values
        ServerStatus ss[] = ServerStatus.values();
        for (ServerStatus serverStatus : ss) {
            System.out.print(serverStatus + " ");
        }
    }
}

enum ServerStatus{
    // ALL THE BELOW ITEMS ARE CONSIDERED AS OBJECTS OF THE ServerStatus type
    RUNNING, FAILED, PENDING, SUCCESS;
}
