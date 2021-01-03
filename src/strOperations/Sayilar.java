package strOperations;

public class Sayilar {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i+",");
                // son yazilan sayi 10a bölünebiliyorsa alt satira gecilmesi
                if(i%10 == 0 && i!=0){
                    System.out.println();
                }
        }
    }
}
