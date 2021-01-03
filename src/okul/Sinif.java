package okul;

public class Sinif {
    private int sinifNo;
    private int ogrenciYas;
    private Ogrenci[] ogrenciler = new Ogrenci[1];

    private int ogrenciIndex = 0;

    public Sinif (int sinifNo, int ogrenciYas){
        this.sinifNo = sinifNo;
        this.ogrenciYas = ogrenciYas;
    }

    public int getSinifNo() {
        return sinifNo;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setSinifNo(int sinifNo) {
        this.sinifNo = sinifNo;
    }

    public void setOgrenciYas(int ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    public void ogrenciEkle(Ogrenci ogrenci){
        if (!(ogrenciIndex < ogrenciler.length)){
            Ogrenci[] tempArray = new Ogrenci[ogrenciler.length+1];
            System.arraycopy(ogrenciler, 0, tempArray, 0, ogrenciler.length);
            ogrenciler = tempArray;
        }
        ogrenciler[ogrenciIndex++] = ogrenci;
    }

    //Sinif ve ogrencilerinin ekrana yazilmasi
    public String toString(Ogrenci ogrenciler){
        System.out.println("Sinif: " + this.sinifNo);
        System.out.println("Ogrenciler:");
        for (int i = 0; i < this.ogrenciler.length; i++) {
            System.out.println(this.ogrenciler[i].toString());
        }
        System.out.println("----------------------------------");
        return null;
    }

    public Ogrenci[] getOgrenciler() {
        return ogrenciler;
    }
}
