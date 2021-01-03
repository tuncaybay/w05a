package strOperations;

public class SekilCiz {
    private static final int MAX_SATIR_SAYISI = 6;

    public static void main(String[] args) {

        // satirlar icin döngü
        for (int i = 1; i <= MAX_SATIR_SAYISI; i++) {
            // yildizlar icin döngü, her satira satir numarasi kadar yildiz yazdirma
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // ekrana yazilan * sayisi satir numarasina ulastiginda alt satira gecilmesi
            System.out.println();
        }
    }
}
