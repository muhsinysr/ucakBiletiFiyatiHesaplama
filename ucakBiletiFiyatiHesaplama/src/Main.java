import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km;
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = scanner.nextInt();

        int yas;
        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        int mesafe;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextInt();

        int yolculukTipi;
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) :");
        yolculukTipi = scanner.nextInt();

        double kmBasinaUcret= 0.10;
        double baslangicTutari = 0;

        if (yas < 12) {
            System.out.print("Toplam Tutar" + ((km * kmBasinaUcret) - (km * (kmBasinaUcret * 0.5))));
        } else if (yas > 12 && yas < 24) {
            System.out.print("Toplam Tutar" + ((km * kmBasinaUcret) - (km * (kmBasinaUcret * 0.1))));
        } else if (yas > 65) {
            System.out.print("Toplam Tutar" + ((km* kmBasinaUcret) - (km * (kmBasinaUcret * 0.3))));
        } else {
            System.out.print("Toplam Tutar" + (km * kmBasinaUcret));

        }
        if (yolculukTipi == 2) {
            System.out.print("Toplam Tutar" + (((km * kmBasinaUcret) - (km * (kmBasinaUcret * 0.2))) * 2));

        }
        if (yas <= 0 && mesafe <= 0) {
            System.out.print("Lütfen geçerli veriler giriniz");
        }



    }}