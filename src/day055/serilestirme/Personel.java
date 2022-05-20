package day055.serilestirme;

import java.io.Serializable;

public class Personel implements Serializable {

    private String sicilNo;
    private String adi;
    private String soyadi;
    private double maasi;


    public Personel(String sicilNo, String adi, String soyadi, double maasi) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maasi = maasi;
    }

    public Personel() {
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }


    @Override
    public String toString() {
        return "Personel{" +
                "sicilNo='" + sicilNo + '\'' +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maasi=" + maasi +
                '}';
    }
}
