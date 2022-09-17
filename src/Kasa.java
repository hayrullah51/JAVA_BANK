import java.util.Scanner;

public class Kasa {

    static int bakiye=20000;
    static int paraMiktari;




    Kasa(){
        System.out.println(bakiye);
    }

     Kasa(int paraMiktari) {
        Scanner scan = new Scanner(System.in);
        if (Menu.secim==2){
            System.out.println("Yatirmak istediginiz tutari giriniz...");
            paraMiktari=scan.nextInt();
            bakiye+=paraMiktari;

        } else if (Menu.secim==3) {
            System.out.println("Cekmek/Gondermek istediginiz tutari giriniz...");
            paraMiktari=scan.nextInt();
            bakiye-=paraMiktari;

        }

         System.out.println("Yeni bakiyeniz : "+bakiye);
    }





}
