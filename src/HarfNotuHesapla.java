import java.util.Scanner;

public class HarfNotuHesapla {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz.");
        String isim = i.nextLine();
        System.out.println("Lutfen quiz notunuzu giriniz.");
        int quiz_not = i.nextInt();
        System.out.println("Lutfen vize notunuzu giriniz.");
        int vize_not = i.nextInt();
        System.out.println("Lutfen final notunuzu giriniz.");
        int final_not = i.nextInt();

        double not_ortalamasi = (quiz_not * 0.1) + (vize_not * 0.30) + (final_not * 0.6);
        boolean gecti_mi = true;
        if (not_ortalamasi >= 85) {
            System.out.println("Sayın " + isim + " Not Ortalamanız: AA");
        } else if (not_ortalamasi >= 70) {
            System.out.println("Sayın " + isim + " Not Ortalamanız: BB");
        } else if (not_ortalamasi >= 60) {
            System.out.println("Sayın " + isim + " Not Ortalamanız: CC");
        } else if (not_ortalamasi >= 45) {
            System.out.println("Sayın " + isim + " Not Ortalamanız: DD");
        } else {
            gecti_mi = false;
            System.out.println("Sayın " + isim + " Not Ortalamanız: FF");
        }
        if (gecti_mi == true) {
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        } else {
            System.out.println("Üzgünüz, sınıfta kaldınız.");
        }
    }
}
