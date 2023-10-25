package Kegiatan1;

public class Bola extends BangunRuang{

    private float jarijari;

    public Bola(int jarijari){
        this.jarijari = jarijari;
    }


    @Override
    float getLuasPermukaan() {
        return 4 * 3.14f * jarijari * jarijari;
    }

    @Override
    float getVolume() {
        return 1.33f * 3.14f * jarijari * jarijari * jarijari;
    }

    void tampil(){

    }
}