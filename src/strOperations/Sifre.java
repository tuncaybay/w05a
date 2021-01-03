package strOperations;

import java.util.Random;

public class Sifre {
    private static final int SIFRE_MIN_UZUNLUK = 8;
    private static final int SIFRE_MAX_UZUNLUK = 16;
    private static final int BUYUK_HARF_SAYISI = 2;
    private static final int RAKAM_SAYISI = 2;
    private static final int OZEL_KARAKTER_SAYISI = 2;

    private static char buyukHarfler[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); //26 adet
    private static char kucukHarfler[] = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //26 adet
    private static char rakamlar[] = "0123456789".toCharArray(); //10 adet
    private static char ozelKarakterler[] = "#$%&()*+,-.<=>?[]{|}".toCharArray(); //20 adet

    private static  Random random = new Random();

    public static void main(String[] args) {
        System.out.println("[Sifre No][uzunluk][Sifre]");
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + (i+1) + "] " + sifreOlustur(sifreUzunlukBelirle()));
        }
    }

    private static int sifreUzunlukBelirle() {
        int sifreUzunluk = random.nextInt(SIFRE_MAX_UZUNLUK - SIFRE_MIN_UZUNLUK + 1) + SIFRE_MIN_UZUNLUK;
        return sifreUzunluk;
    }

    private static char[] karakterEkle(char karakterler[], int uzunluk) {
        char sifre[]=new char[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            int randomSayi = random.nextInt(karakterler.length);
            sifre[i] = karakterler[randomSayi];
        }
        return sifre;
    }

    private static String sifreOlustur(int uzunluk){

        int kucukHarfSayisi = uzunluk-BUYUK_HARF_SAYISI-RAKAM_SAYISI-OZEL_KARAKTER_SAYISI;

        char sifreKucukHarfler[] = karakterEkle(kucukHarfler,kucukHarfSayisi);
        char sifreBuyukHarfler[] = karakterEkle(buyukHarfler,BUYUK_HARF_SAYISI);
        char sifreRakamlar[] = karakterEkle(rakamlar,RAKAM_SAYISI);
        char sifreOzelKarakterler[] = karakterEkle(ozelKarakterler,OZEL_KARAKTER_SAYISI);

        String sifre = "[" + uzunluk + "] " + String.valueOf(sifreKucukHarfler) + String.valueOf(sifreBuyukHarfler) + String.valueOf(sifreRakamlar) + String.valueOf(sifreOzelKarakterler);

        return sifre;
    }
}





