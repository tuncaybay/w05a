package okul;

public class Ogrenci {

    private String isim;
    private String soyIsim;
    private int yas;
    private String okulNo;

    public Ogrenci(String isim, String soyIsim, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        setOkulNo(isim,soyIsim,yas);
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setOkulNo(String isim, String soyIsim, int yas) {
        this.okulNo = isim.substring(0,2).toUpperCase() + soyIsim.substring(soyIsim.length()-3).toUpperCase()+yas;
    }

    public String getOkulNo(){
        return okulNo;
    }

    public String toString(){
        return this.getOkulNo() + ", " + getIsim() + " " + getSoyIsim().toUpperCase();
    }
}
