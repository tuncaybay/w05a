import com.sun.jdi.IntegerValue;
import okul.Ogrenci;
import okul.Sinif;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Okul {
    private static final int MAX_OGRENCI = 10;
    public static List<Ogrenci> ogrenciler = new LinkedList<>();

    // bu liste sadece girilen verilerin kontrolü icin, (Objeleri olusturmadan önce)
    public static List<String[]> ogrencilerInput = new ArrayList<String[]>();

    public static List<Sinif> siniflar = new LinkedList<>();
        public static void main(String[] args) {
            for (int i = 0; i < MAX_OGRENCI; i++) {
                ogrencilerInput.add(new String[3]);
            }

            init();

            if (kontrolEt(true)){
                ogrenciKaydet();
                ogrenciYerlerstir();
                ogrecileriYazdir();
            }
        }


    public static void init() {
        //siniflari olustur
        siniflar.add(new Sinif(1, 6));
        siniflar.add(new Sinif(2, 7));
        siniflar.add(new Sinif(3, 8));
        siniflar.add(new Sinif(4, 9));
        siniflar.add(new Sinif(5, 10));

        //ogrencilerin konsoldan girilmesi
        String adi = null;
        String soyadi = null;
        int yasi = 0;
        for (int i = 0; i < MAX_OGRENCI; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ogrenci [" + (i+1) + "] Adi: ");
            ogrencilerInput.get(i)[0] = sc.nextLine();
            System.out.print("Ogrenci [" + (i+1) + "] Soyadi: ");
            ogrencilerInput.get(i)[1] = sc.nextLine();
            System.out.print("Ogrenci [" + (i+1) + "] Yasi: ");
            ogrencilerInput.get(i)[2] = sc.nextLine();
        }
    }

    public static boolean kontrolEt(boolean check){
        for (int i = 0; i < MAX_OGRENCI; i++) {
            //isim uzunlugu 3 harften kisa ise hata ver
            if ((ogrencilerInput.get(i)[0]).length()<3 ) {
                System.out.println("Ogrenci [" + (i+1) + "] Isim hatali: " + ogrencilerInput.get(i)[0]);
                check = false;
            }

            //soyisim uzunlugu 3 harften kisa ise hata ver
            if ((ogrencilerInput.get(i)[1]).length()<3) {
                System.out.println("Ogrenci [" + (i+1) + "] Soyisim hatali: " + ogrencilerInput.get(i)[1]);
                check = false;
            }

            //yas verilmemisse yada 6 ile 10 arasinda degilse hata ver
            if (ogrencilerInput.get(i)[2].equals("") || (Integer.valueOf(ogrencilerInput.get(i)[2]))<6 || Integer.valueOf(ogrencilerInput.get(i)[2])>10) {
                System.out.println("Ogrenci [" + (i+1) + "] Yas hatali: " + ogrencilerInput.get(i)[2]);
                check = false;
            }
        }
        return check;
    }

    // veriler hatali degilse ögrencilerin kayit edilmesi
    private static void ogrenciKaydet() {
        for (int i = 0; i < MAX_OGRENCI; i++) {
            ogrenciler.add(new Ogrenci(ogrencilerInput.get(i)[0],ogrencilerInput.get(i)[1],Integer.valueOf(ogrencilerInput.get(i)[2])));
        }
    }

    // Ogrencilerin yaslarina göre siniflara yerlestirilmesi
    public static void ogrenciYerlerstir(){

            for (int j = 0; j < ogrenciler.size(); j++) {
                switch (ogrenciler.get(j).getYas())
                {
                    case 6:
                        siniflar.get(0).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 7:
                        siniflar.get(1).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 8:
                        siniflar.get(2).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 9:
                        siniflar.get(3).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 10:
                        siniflar.get(4).ogrenciEkle(ogrenciler.get(j));
                }
            }
    }

    // ogrencilerin ekrana yazdirilmasi
    public static void ogrecileriYazdir(){
        for (int i = 0; i < siniflar.size(); i++) {
            siniflar.get(i).toString(ogrenciler.get(i));
        }
    }
    }



