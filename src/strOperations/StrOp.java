package strOperations;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StrOp {

    public static void main(String[] args) {
        System.out.println(isimSor());
    }

    private static String isimSor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Isim Soyisim: ");
        String isim = sc.nextLine();

        // Basta veya sondaki bosluklarin silinmesi
        isim = isim.trim();

        // isim degiskeninin char array a cevrilisi
        char isimHarfleri[] = isim.toCharArray();
        int boslukSayisi = 0;

        for (int i = 0; i < isimHarfleri.length; i++) {
            if(isimHarfleri[i] == ' '){
                boslukSayisi++;
            }
        }
        
        // girilen karakter sayisi en az 5 degilse ve en az bir bosluk yoksa kullaniciya hata bildirisi
        if (isim.length() < 5 && boslukSayisi == 0){
            System.out.println("yanlis veri girdiniz, lütfen tekrar deneyin");
        } else {

            // ilk harfin büyük harfe cevrilmesi
            isimHarfleri[0] = Character.toUpperCase(isimHarfleri[0]);

            // bosluktan sonra gelen harf(ler)in büyük harfe cevrilmesi
            for (int i = 0; i < isimHarfleri.length; i++) {
                if (isimHarfleri[i] == ' ') {
                    isimHarfleri[i + 1] = Character.toUpperCase(isimHarfleri[i + 1]);
                }
            }

            // char array daki harflerin string e cevrilisi
            isim = new String(isimHarfleri);
        }
        return isim;
    }
}


