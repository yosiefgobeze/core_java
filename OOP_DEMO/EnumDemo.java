package OOP_DEMO;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        // select a country - define
        // Scanner sc = new Scanner(System.in);
        
        //FiveAfricanCountries ea = FiveAfricanCountries.Chad;
        // switch (sc.nextInt()) {
        //     case 0:
        //         System.out.println("Abdelaziz Bouteflika");
        //         break;
        //     case 1:
        //         System.out.println("Mokgweetsi Masisi");
        //         break;
        //     case 2:
        //         System.out.println("Idriss Déby");
        //         break;
        //     case 3:
        //         System.out.println("Ismaïl Omar Guelleh");
        //         break;
        //     case 4:
        //         System.out.println("Isaias Afwerki");
        //         break;
        //     default:
        //         break;
        // }
        FiveAfricanCountries ac[] = FiveAfricanCountries.values();
        for(FiveAfricanCountries af: ac){
            System.out.println(af + " -- " + af.getPresident());
        }

    }
}

enum FiveAfricanCountries{
    Algeria("Abdelaziz Bouteflika"), Botswana(), Chad("Idriss Déby"), Djibouti("Ismaïl Omar Guelleh"), Eritrea("Isaias Afwerki");
    private String president;

    // private constructor works because the objects are created within the class itself
    private FiveAfricanCountries(String president) {
        this.president = president;
    }

    

    private FiveAfricanCountries() {
        this.president = "Unknown";
    }



    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    


    
}
