package CORE_JAVA_DEMO;
public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = {5, 8, 9, 6, 7};
        System.out.println(nums[1]);

        int lists[] = new int[5];
        for(int i = 0; i < lists.length; i++){
            lists[i] = i+2;
            System.out.println(lists[i]);
        }
        System.out.println("****************************");
        int scores[][] = new int[4][4];
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores.length; j++){
                scores[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("***************************");
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores.length; j++){
                System.out.print(scores[i][j] + " ");
            } 
            System.out.println();      
        }

        System.out.println();
        for (int[] is : scores) {
            for(int i: is){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
