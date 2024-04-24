package CORE_JAVA_DEMO;
public class Do_While {
    public static void main(String[] args) {
        // use case for a do while loop
        // let's consider there is a trial version of a software which will allow user to use for seven days.
        boolean isSubscriber = false;
        int days = 1;

        do{
            System.out.println("Watching....");
            days++;
            isSubscriber = (days <= 7)?true:false;
            
        }while(isSubscriber);

    }
}
