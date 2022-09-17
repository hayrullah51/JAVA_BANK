import java.util.Scanner;

public class SifreEkrani {

static String sifreNo="";

    SifreEkrani(){

        System.out.println("---------------------------");
        System.out.println("****hosgeldiniz****");
        System.out.println("---------------------------");
        String kartNo="";
        kartNoKabul(kartNo);
        sifre(sifreNo);
        System.out.println("Giris basarili...");


    }

    private static void sifre(String sifreNo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        sifreNo=scan.nextLine();

        if (sifreNo.equals("Sinan")){
            System.out.println("Sifre basarili");
        }else {
            System.out.println("Gecersiz sifre");
            sifre(sifreNo);
        }


    }

    private static void kartNoKabul(String kartNo) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kart no giriniz...");
        kartNo= scan.nextLine();
        kartNo=kartNo.replaceAll("\\D","");

        if (kartNo.length()==16){
            System.out.println("kart no gecerli");
        }else {
            System.out.println("Tekrar deneyin");
            kartNoKabul(kartNo);
        }

    }

    public static void sifreDegistir(){
        System.out.println("Sifre degistirme ekranina hos geldiniz");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Eski sifrenizi giriniz");
        String sifreNo=scan.nextLine();

        if (sifreNo.equals("Sinan")){
            System.out.println("Lutfen yeni sifre giriniz");
            sifreNo=scan.nextLine();
        }else {
            System.out.println("Gecersiz sifre");
            sifre(sifreNo);
        }

    }


}
