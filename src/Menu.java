import java.util.Scanner;

public class Menu extends Kasa{
static int secim;


     Menu(){

        System.out.println("Ana menuye hos geldiniz");
        System.out.println("1--> bakiye sorgulama");
        System.out.println("2--> para yatırma");
        System.out.println("3--> para gonderme");
        System.out.println("4--> sifre degistir");
        System.out.println("5--> cıkıs");
        Scanner scan = new Scanner(System.in);
        secim=scan.nextInt();

        switch (secim){
            case 1:
                Kasa obj1= new Kasa();
                menuDongusu();
                break;
            case 2:
                   Kasa obj2= new Kasa(paraMiktari);
                   menuDongusu();
                   break;

            case 3:
                Kasa obj3= new Kasa(paraMiktari);
                menuDongusu();
                break;

            case 4:
                SifreEkrani.sifreDegistir();
                menuDongusu();
                break;
            case 5:
                break;
        }
    }

    public static void menuDongusu(){
        System.out.println("Baska islem yapmak istiyorsaniz E'ye basin cikmak icin herhangi tusa basin ");
        Scanner scan = new Scanner(System.in);
        String menuDongu = scan.next();
        if (menuDongu.equalsIgnoreCase("E")){
            Menu menu = new Menu();
        }
    }
}
