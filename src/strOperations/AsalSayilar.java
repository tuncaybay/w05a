package strOperations;


public class AsalSayilar {
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        //MAX_VALUE uzunlugunda boolean array olusturulmasi
        boolean sayilar[] = new boolean[MAX_VALUE];

        //arrayin butun elemanlarina true atanmasi
        for (int i = 0; i < MAX_VALUE; i++) {
            sayilar[i] = true;
        }

        //kendinden ve birden baska sayilara bolunebilen elemanlara false atanmasi, (degeri degismeyen elemanlar asal sayilar)
        for (int i = 2; i < MAX_VALUE ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayilar[i] = false;
                }
            }
            }

        // arrayda degeri true olan (asal sayilar) elemanlarin ekrana yazilmasi
        for (int i = 1; i < MAX_VALUE; i++) {
            if(sayilar[i]==true){
                System.out.print(i+",");
            }
        }
    }
}
