package CORE_JAVA_DEMO;
public class For_Loop {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            // print the working days of the week and print the hours 9 to 5
            System.out.println("Today: " + i);
            for(int j=9; j<=17; j++){
                if (j>12) {
                    System.out.println("CURRENT HOUR: " + (j-12) + "PM");
                }else if (j>=9 && j<12) {
                    System.out.println("CURRENT HOUR: " + j + "AM");
                }else{
                    System.out.println("CURRENT HOUR: " + j + "PM");
                }
                
            }
        }
    }
}
