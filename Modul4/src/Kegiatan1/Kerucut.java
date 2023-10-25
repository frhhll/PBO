package Kegiatan1;

public class Kerucut extends BangunRuang{

    private float jarijari, tinggi, sisi;

    public Kerucut(int jarijari, int tinggi, int sisi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }


    @Override
    float getLuasPermukaan() {
        return (3.14f * jarijari * jarijari) + (3.14f * jarijari * sisi);
    }

    @Override
    float getVolume() {
        return 0.33f * 3.14f * jarijari * jarijari * tinggi;
    }

    void tampil(){

    }
}